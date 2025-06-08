public class Day2TypeCastingImplict
{
    public static void main(String[] args) 
    {
      
        byte a=127;

        // Implicit conversion
        // The int value is cast to a byte, which may cause data loss if the value exceeds byte range
         int b= a;

        // Print the byte value 'b' which holds the casted int value
        System.out.println(b);// Output:127
    }
}
