import java.util.Scanner;
public class Day7Pattern3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter no of row:");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print((char)(65+i)+" ");
        }
        scanner.close();
    }  
}
