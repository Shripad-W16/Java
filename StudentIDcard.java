class Student {
    String name, id;

    Student(String n, String i) {
        name = n;
        id = i;
    }

    void show() {
        System.out.println("ID: " + id + " Name: " + name);
    }
}

public class StudentIDcard {
    public static void main(String[] args) {
        Student s = new Student("Shripad ", "5757575");
        s.show();
    }
}