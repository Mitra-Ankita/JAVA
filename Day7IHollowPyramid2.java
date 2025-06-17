import java.util.Scanner;
public class Day7IHollowPyramid2
{
    public static void main(String[] args)
    {
      Scanner scanner=new Scanner(System.in);
      System.out.print("enter the no of rows:");
      int n=scanner.nextInt();
      for(int i=0;i<n;i++)
      {
        System.out.print("  ".repeat(i)+(i+1)+" ");
        if(i<=n-2)
        {
            System.out.print("  ".repeat(2*n-2*i-3)+(i+1)+" ");
        }
        System.out.println();
      }
      scanner.close();
    }
}