public class Day4Return 
{
    // Method to check if a number is even or odd
    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(4));  // Output: Even
        System.out.println(checkEvenOdd(7));  // Output: Odd
    }
}
