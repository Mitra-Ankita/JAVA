import java.util.Scanner;
public class Day7IPyramid4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter no of row:");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("  ".repeat(i));
            for(int j=0;j<n-i;j++)
            {
                System.out.print((j+1)+"   ");
            }
            System.out.println();
        }
        scanner.close();
    }  
}
