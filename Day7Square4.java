import java.util.Scanner;
public class Day7Square4 {
   public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter no of rows:");
    int n=scanner.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
        System.out.print((j+1)+" ");
        }
        System.out.println();
    }
    scanner.close();
   } 
}
