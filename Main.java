//parent class
class Person {
    // initialize the variables
    String name;
    int age;

    // constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// child class
class Student extends Person {
    int id;
    String course;

    // constructor
    Student(String name, int age, int id, String course) {
        // show that name and age were inherited
        super(name, age);
        this.id = id;
        this.course = course;
    }

    // method-display information
    void diplaystudentinfo() {
        // access the display method
        displayInfo();
        System.out.println("Id: " + id);
        System.out.println("Course: " + course);
    }
}

// main class
public class Main {
    // main method
    public static void main(String[] args) {
        // create an object-used to execute the class
        Student s = new Student("Jane Doe", 12, 101, "Business Management");
        s.diplaystudentinfo();
    }
}