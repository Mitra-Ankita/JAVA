 import java.util.Scanner;
public class Day5UserArray
 {
    public static void main(String[] args) {
        // This program reads the size and elements of an array from user input,
        // then prints the elements of the array.
        Scanner sc = new Scanner(System.in);                 // Step 1

        System.out.print("Enter size of array: ");           // Step 2
        int size = sc.nextInt();

        int[] arr = new int[size];                           // Step 3

        System.out.println("Enter " + size + " elements:");  // Step 4
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();                           // Step 5
        }

        System.out.println("You entered:");                  // Step 6
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
     }
}
        



/*
        Example output:
        Enter size of array: 3
        Enter 3 elements:
        10
        20
        30
        You entered:
        10
        20
        30
        */
    
