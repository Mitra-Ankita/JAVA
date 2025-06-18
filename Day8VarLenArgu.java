public class Day8VarLenArgu 
{
    public static void main(String[] args) 
    {
        numbers(10,20,30);

    }
    public static void numbers(int ... arr)
    {
        for(int num:arr)
        {
            System.out.println(num);
        }
    }
}
