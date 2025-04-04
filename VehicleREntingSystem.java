interface Rentable {
    void rent();
}

class Engine {
    void start() 
    {
        System.out.println("Engine is starting..");
    }
}

class Car implements Rentable 
{
    private Engine engine = new Engine();

    public void rent() 
    {
        System.out.println("Car rented successfully");
        engine.start();
    }
}

class Bike implements Rentable {
    public void rent() {
        System.out.println("Bike rented successfully");
    }
    }

public class VehicleREntingSystem {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();

        car.rent();
        bike.rent();
    }
}