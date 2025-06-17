import java.util.Scanner;
public class Day7IPyramid1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter no of row:");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("  ".repeat(i)+"*   ".repeat(n-i));
        }
        scanner.close();
    } 
}
