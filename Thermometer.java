class ThermometerS {
    double temperatureC;

    ThermometerS(double tempC) {
        temperatureC = tempC;
    }

    void display() {
        System.out.println(temperatureC + "°C / " + ((temperatureC * 9 / 5) + 32) + "°F");
    }
}

public class Thermometer {
    public static void main(String[] args) {
        Thermometer thermo1 = new ThermometerS(25);
        thermo1.display();
    }
}