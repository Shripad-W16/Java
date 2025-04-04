import java.util.Scanner;

class HealthTracker1 {
    double weight, height;

    HealthTracker1 (double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    double calculateBMI() {
        return weight / (height * height);
    }

    void displayStatus() {
        double bmi = calculateBMI();
        System.out.println("\n Health Tracker");
        System.out.println("=================");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 24.9) System.out.println(" Normal Weight");
        else if (bmi < 29.9) System.out.println(" Overweight");
        else System.out.println("Obese");

        System.out.println("=================");
    }
}

public class HealthTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (meters): ");
        double height = sc.nextDouble();

        HealthTracker tracker = new HealthTracker(weight, height);
        tracker.displayStatus();
    }
}