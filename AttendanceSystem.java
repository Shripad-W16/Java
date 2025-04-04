class Student {
    String name;
    boolean isPresent;

    Student(String name) 
    {
        this.name = name;
        this.isPresent = false; 
    }

    void markPresent() 
    {
        isPresent = true;
    }

    void showAttendance()
     {
        System.out.println(name + ":- " + (isPresent ? "Present" : "Absent"));
    }
}

public class AttendanceSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Shripad");
        Student s2 = new Student("Aman");

        s1.markPresent(); 

        s1.showAttendance();
        s2.showAttendance();
    }
}