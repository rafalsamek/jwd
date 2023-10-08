package datatypes;

public class Employee {
    String firstName;
    String lastName;
    byte age;
    char gender;
    long personalIDNumber;

    public void showDetails() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Personal ID Number: " + personalIDNumber);
    }
}
