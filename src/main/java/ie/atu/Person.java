package ie.atu;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayInfo()
    {
        System.out.println("First name is " + firstName + " LastName " + lastName + "Age " + age);
    }
}
