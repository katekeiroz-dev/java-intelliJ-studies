// Encapsulation Example
class Person {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age (with validation)
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person("Alice", 25);

        // Accessing private variables via public methods
        System.out.println("Name: " + person.getName()); // Output: Alice
        System.out.println("Age: " + person.getAge());   // Output: 25

        // Modifying values using setters
        person.setName("Bob");
        person.setAge(30);

        // Printing updated values
        System.out.println("Updated Name: " + person.getName()); // Output: Bob
        System.out.println("Updated Age: " + person.getAge());   // Output: 30

        // Attempting to set an invalid age
        person.setAge(-5);  // Output: Age must be positive!
    }
}


