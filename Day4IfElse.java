import java.util.Scanner;
// This program reads an integer from the user and determines if it is even or odd.
// It then prints "Even" if the number is even, or "Odd" if the number is odd.
public class Day4IfElse 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);  

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the integer input from the user
        int num = scanner.nextInt();  

        // Check if the number is divisible by 2 (even)
        if (num % 2 == 0) {
            // If divisible by 2, print "Even"
            System.out.println("Even");
        } 
        else {
            // Otherwise, print "Odd"
            System.out.println("Odd");
        }

        // Close the scanner to free resources
        scanner.close();  
    }
}

