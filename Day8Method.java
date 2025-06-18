public class Day8Method {

    // User-defined method inside the main class
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Main method – program execution starts here
    public static void main(String[] args) {
        // Calling the user-defined method directly (because it's static)
        int result = multiply(4, 5);

        // Printing the result
        System.out.println("Multiplication result: " + result);
    }
}
