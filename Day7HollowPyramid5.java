import java.util.Scanner;
public class Day7HollowPyramid5
{
    public static void main(String[] args)
    {
      Scanner scanner=new Scanner(System.in);
      System.out.print("enter the no of rows:");
      int n=scanner.nextInt();
      int z=(char)(65);
      for(int i=0;i<n;i++)
      {
        System.out.print("  ".repeat(n-i-1)+(char)(z));
        
        if(i>0)
        {
            
            System.out.print("  ".repeat(2*i-1)+(char)(z+1));
        }
        z++;
        System.out.println();
      }
      scanner.close();
    }
}