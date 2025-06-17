import java.util.Scanner;
public class Day7HollowDimond1
{
  public static void main(String[] args)
    {
      Scanner scanner=new Scanner(System.in);
      System.out.print("enter the no of rows:");
      int n=scanner.nextInt();
      for(int i=0;i<n;i++)
      {
        System.out.print("  ".repeat(n-i-1)+"* ");
        if(i>0)
        {
            System.out.print("  ".repeat(2*i-1)+"* ");
        }
        System.out.println();
      }
    
      for(int i=0;i<n-1;i++)
      {
        System.out.print("  ".repeat(i+1)+"* ");
        if(i<n-2)
        {
            System.out.print("  ".repeat(n-2*i-1)+"* ");
        }
        System.out.println();
      }
      scanner.close();

    }
}