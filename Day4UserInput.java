import java.util.Scanner;

// This class demonstrates how to take user input in Java using Scanner
public class Day4UserInput
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name:");

        // Read the user input as a string
        String name=scanner.nextLine();

        // Print the entered name
        System.out.println("My name is "+name);

        // Example output:
        // Enter your name:
        // My name is Ankit

        // Close the scanner to free resources
        scanner.close();
    }
}
