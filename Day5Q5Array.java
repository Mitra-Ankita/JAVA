public class Day5Q5Array 
{
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};  // Original array

        // Create another array with same length
        int[] copy = new int[original.length];

        // Copy elements manually
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Display copied array
        System.out.println("Copied Array:");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
  
