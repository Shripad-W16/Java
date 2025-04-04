
class Animal {
    String name = "Generic Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super(); 
        System.out.println("Dog constructor called");
    }

    void displayNames() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name); 
    }

    void makeSound() {
        super.makeSound(); 
        System.out.println("Dog barks!");
    }
}


public class SuperAsKeyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.displayNames();
        myDog.makeSound();
    }
}