public class Day2TypeCastingExplict
{
    public static void main(String[] args) 
    {
      
        int a=12;

        // Explicit conversion (casting) from int to byte
        // The int value is cast to a byte, which may cause data loss if the value exceeds byte range
        byte b=(byte) a;

        // Print the byte value 'b' which holds the casted int value
        System.out.println(b);// Output:12
    }
}
