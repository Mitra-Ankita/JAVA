import java.util.Scanner;
/**
 * This program takes an integer input from the user
 * and determines if the number is positive, negative, or zero
 * using if-else if-else conditional statements.
 */
public class Day4IfElseIf{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }    
}
/*
Sample Output:
Enter a number: 5
The number is positive.
*/
