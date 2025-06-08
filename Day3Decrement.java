public class Day3Decrement 
{
    public static void main(String[] args) 
    {
        // Initialize variable a with value 10
        int a=10;

        // Assign a to b, then post-increment a (b = 10, a = 11)
        int b=a--;
        System.out.println(b); // Output: 10

        // Pre-increment b, then assign to c (b = 11, c = 11)
        int c=--b;
        System.out.println(c); // Output: 9
    }
}
//--a:Pre-decrement states that decrements first, then returns the new value.
//a--:Post decrement states that returns the current value, then decrements.

