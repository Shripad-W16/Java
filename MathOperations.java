class MathOperations1 {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }
    int multiply(int a, int b) { return a * b; }
    double divide(int a, int b) { return (b != 0) ? (double) a / b : Double.NaN; }

    int square(int a) { return a * a; }
    int cube(int a) { return a * a * a; }
    double power(double base, double exp) { return Math.pow(base, exp); }
    double squareRoot(double a) { return Math.sqrt(a); }
}

public class MathOperations {
    public static void main(String[] args) {
        MathOperations1 math = new MathOperations1();
        
        System.out.println("Addition: " + math.add(10, 5));
        System.out.println("Subtraction: " + math.subtract(10, 5));
        System.out.println("Multiplication: " + math.multiply(10, 5));
        System.out.println("Division: " + math.divide(10, 5));

        System.out.println("Square: " + math.square(4));
        System.out.println("Cube: " + math.cube(3));
        System.out.println("Power: " + math.power(2, 4));
        System.out.println("Square Root: " + math.squareRoot(16));
    }
}