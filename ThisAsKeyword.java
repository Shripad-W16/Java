class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name; // Using `this` to refer to the instance variable
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisAsKeyword {
    public static void main(String[] args) {
        Student s = new Student("Shripad", 18);
        s.display();
    }
}