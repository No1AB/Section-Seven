public class Constructor {

    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 10000, 2020, "Green");
        

    }
    public Car(String make, double price, int year, String colour) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.colour = colour;
    }
}