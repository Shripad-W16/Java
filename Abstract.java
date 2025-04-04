
abstract class Animal {
    abstract void makeSound(); 

    void sleep() 
    { 
        System.out.println("Sleeping..");
    }
}


class Dog extends Animal {
    void makeSound() 
    { 
        System.out.println("Woof Woof");
    }
}

public class Abstract {
    public static void main(String[] args) 
    {
        Animal myDog = new Dog(); 
        myDog.makeSound();  
        myDog.sleep();  
    }
}