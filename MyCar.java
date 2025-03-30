
class Car {
    
    String brand;
    String model;
    int year;
    double price;

    
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
        System.out.println("Price: Rs." + price);
    }
}

public class MyCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Fortuner";
        myCar.year = 2025;
        myCar.price = 5700000.0;
        myCar.displayDetails();
    }
}