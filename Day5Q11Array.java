public class Day5Q11Array 
{
   public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56, 22};

        // Initialize largest and smallest with first element
        int largest = arr[0];
        int smallest = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];  // Update largest
            }
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}

