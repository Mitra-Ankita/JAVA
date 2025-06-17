import java.util.Scanner;
public class Day7Square1 {
   public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter no of rows:");
    int n=scanner.nextInt();
    for(int i=0;i<n;i++)
    {
        System.out.println("* ".repeat(n));
    }
    scanner.close();
   } 
}
