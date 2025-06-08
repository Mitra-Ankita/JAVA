public class Day3Increment 
{
    public static void main(String[] args) 
    {
        // Initialize variable a with value 10
        int a=10;

        // Pre-increment a, then assign to b (b = 11, a = 11)
        int b=++a;
        System.out.println(b); // Output: 11

        // Assign b to c, then post-increment b (c = 11, b = 12)
        int c=b++;
        System.out.println(c); // Output: 11

    }
}
//++a:Pre-increment states that increments first, then returns the new value
//a++:Post-increment states that returns the current value, then increments