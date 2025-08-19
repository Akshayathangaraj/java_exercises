
class Student {
    // Data members (fields)
    String name;
    int age;

    // Constructor (used to initialize object)
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method to check if the student is an adult
    boolean isAdult() {
        return age >= 18;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects using constructor
        Student s1 = new Student("Akshaya", 20);
        Student s2 = new Student("Ravi", 16);

        // Calling methods
        s1.displayDetails();
        System.out.println("Is Adult? " + s1.isAdult());

        s2.displayDetails();
        System.out.println("Is Adult? " + s2.isAdult());
    }
}
