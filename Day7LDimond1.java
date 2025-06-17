import java.util.Scanner;
public class Day7LDimond1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter no of row:");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("  ".repeat(n-i-1)+"* ".repeat(i+1));
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("  ".repeat(i+1)+"* ".repeat(n-i-1));
        }
        scanner.close();
    }  
}
