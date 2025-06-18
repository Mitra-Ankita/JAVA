public class Day8FormalActual 
{
    public  static void main (String[] args )
    {
        int output=addition(5,2); // Actual Argument 
        System.out.println(output);
    }
    public static int addition(int a, int b)// Formal Argument
    {
        int res=a+b;
        return res;
    }
}
