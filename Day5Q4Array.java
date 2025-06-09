public class Day5Q4Array 
{
   
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Try changing values to include duplicates
        boolean isUnique = true;
        // Compare each element with every other element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (!isUnique) break;
        }
        // Print result
        if (isUnique) {
            System.out.println("Array contains only unique values.");
        } else {
            System.out.println("Array contains duplicate values.");
        }
    }
}
   

