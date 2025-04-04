// Method Overloading Same method name with different parameters
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding Subclass redefines parent method
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method (Overridden)");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Overloading Example
        MathUtils m = new MathUtils();
        System.out.println(m.add(5, 10));       // Output: 15
        System.out.println(m.add(5, 10, 20));   // Output: 35

        // Overriding Example
        Parent obj = new Child(); // Runtime polymorphism
        obj.show(); // Calls overridden method in Child, Output: "Child class method"
    }
}