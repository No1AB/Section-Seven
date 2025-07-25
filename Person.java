import java.util.Arrays; // Import necessary package for array operations

/**
 * The Person class represents an individual with attributes such as 
 * name, nationality, date of birth, passport information, and seat number.
 */
public class Person {
    
    // Fields (Attributes of a Person)
    private String name; // The person's name
    private String nationality; // The person's nationality
    private String dateOfBirth; // The person's date of birth (stored as a String)
    private String[] passport; // An array to store passport details
    private int seatNumber; // The seat number assigned to the person

    /**
     * Constructor to initialize a Person object with basic details.
     * 
     * @param name The name of the person.
     * @param nationality The nationality of the person.
     * @param dateOfBirth The date of birth of the person.
     * @param seatNumber The seat number assigned to the person.
     */
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    /**
     * Copy constructor that creates a new Person object by copying details 
     * from another Person object.
     * 
     * @param source The Person object to be copied.
     */
    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;

        // Deep copy of the passport array to avoid reference issues
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
        
        this.seatNumber = source.seatNumber;
    }

    /**
     * Getter method for name.
     * 
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     * 
     * @param name The new name to be set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for nationality.
     * 
     * @return The nationality of the person.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Setter method for nationality.
     * 
     * @param nationality The new nationality to be set.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Getter method for date of birth.
     * 
     * @return The date of birth of the person.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter method for date of birth.
     * 
     * @param dateOfBirth The new date of birth to be set.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter method for seat number.
     * 
     * @return The assigned seat number of the person.
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * Setter method for seat number.
     * 
     * @param seatNumber The new seat number to be assigned.
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * Getter method for passport.
     * 
     * @return A copy of the passport details to ensure data encapsulation.
     */
    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length); // Returning a copy for safety
    }

    /**
     * Setter method for passport (Currently not implemented).
     */
    public void setPassport() {
        passport = new String[] {name, nationality, dateOfBirth};
    }

    /**
     * Simulates applying for a passport.
     * 
     * @return true if the passport application is successful, false otherwise.
     */
    public boolean applyPassport() {
        int number = (int) (Math.random() * 2); // Generates either 0 or 1 randomly
        return number == 1; // Returns true if 1 (50% chance)
    }

    /**
     * Randomly assigns a seat number between 1 and 11.
     */
    public void chooseSeat() {
        seatNumber = ((int) (Math.random() * 11 + 1)); // Assigns a random seat from 1 to 11
    }


    
    public String toString() {
        return "Name: " + this.name + "\n" 
        +  "Nationality: " + this.nationality + "\n"
        +  "Date of birth: " + this.dateOfBirth + "\n"
        +  "Seat Number: " + this.seatNumber + "\n"
        +  "Passport: " + Arrays.toString(passport) + "\n";
    
    }

}
