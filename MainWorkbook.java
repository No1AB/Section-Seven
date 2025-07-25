import java.util.Arrays;

public class MainWorkbook {
  
    public static void main(String[] args) {

        Person person = new Person("Alastair Bhowmik", "British", "12/02/1988", 5); 
        if (person.applyPassport()) {
            person.setPassport();
        }
        System.out.println(person);
     }

     
     
}
