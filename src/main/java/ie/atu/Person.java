package ie.atu;

import java.util.Scanner;
public class Person {
    String firstName;
    String lastName;
    int age;

    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void getUserInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
    }

    public void displayInfo()
    {
        System.out.println("First name is " + firstName + " LastName " + lastName + " Age " + age);
    }
}
