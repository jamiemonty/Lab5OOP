package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Create a new person object
        Person student1 = new Person();

        student1.displayInfo();

        Person user =  new Person();

        //Get user input
        user.getUserInput();

        //Call the displayInfo method
        user.displayInfo();
        }
    }