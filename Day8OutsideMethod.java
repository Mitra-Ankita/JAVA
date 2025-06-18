class Sample 
{
    public void demo() 
    {
        System.out.println("hello");
    }
}

public class Day8OutsideMethod
{
    public static void main(String[] args)
    {
        Sample s = new Sample();  // Creating object of Sample class
        s.demo();                 // Calling method demo()
    }
}
    
