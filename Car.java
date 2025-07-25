import java.util.Arrays;

public class Car {
    private String make;//Private means the field is private to the class it was defined in, not visible elsewhere.
    private double price;
    private int year;
    private String colour;
    private String[] parts;


    public Car(String make, double price, int year, String colour, String[] parts) {
    this.make = make;
    this.price = price;
    this.year = year;
    this.colour = colour;
    this.parts = Arrays.copyOf(parts, parts.length );
    }


    public Car (Car source){
      this.make = source.make;
      this.price = source.price;
      this.year = source.year;
      this.colour = source.colour;
      this.parts = source.parts;

    }


  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }


  public String[] getParts() {
    return Arrays.copyOf(this.parts, this.parts.length);
  }

  public void setParts(String[] parts) {
    this.parts = Arrays.copyOf(parts, parts.length);
  }


  public void drive() {
    System.out.println("\nYou bought a beautiful " + this.year + " " + this.colour + " " + this.make + " for " + this.price + ".");
    System.out.println("Please drive your car to the nearest exit.");
  }

  public String toString() {
    return "Make: " + this.make + ".\n" 
    +  "Price: " + this.price + ".\n"
    +  "Year: " + this.year + ".\n"
    +  "Color: " + this.colour + ".\n"
    +  "Parts: " + Arrays.toString(parts) + ".\n";

}
   

}
