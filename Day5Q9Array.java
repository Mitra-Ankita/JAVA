public class Day5Q9Array
{
    public static void main(String[] args) {
        int[] arr = {15, 22, 8, 19, 31, 4};

        // Initialize max and min with first element
        int max = arr[0];
        int min = arr[0];

        // Loop through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max
            }
            if (arr[i] < min) {
                min = arr[i];  // Update min
            }
        }

        // Print results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
   
