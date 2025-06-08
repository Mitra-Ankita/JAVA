public class Day3ArithmeticOperators {
    public static void main(String[] args) {
        int a = 25;
        int b = 5;

        // Arithmetic operations
        int sum = a + b;        // Addition
        int difference = a - b; // Subtraction
        int product = a * b;    // Multiplication
        int quotient = a / b;   // Division
        int remainder = a % b;  // Modulus (remainder)

        // Display results
        System.out.println("a = " + a); // Output: 25
        System.out.println("b = " + b); // Output: 5
        System.out.println("Sum (a + b) = " + sum); // Output: 30
        System.out.println("Difference (a - b) = " + difference); // Output: 20
        System.out.println("Product (a * b) = " + product); // Output: 125
        System.out.println("Quotient (a / b) = " + quotient); // Output: 5
        System.out.println("Remainder (a % b) = " + remainder); // Output: 0
    }
}
