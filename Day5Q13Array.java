public class Day5Q13Array 
{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};
        System.out.println("Duplicate values in the array:");
        // Boolean array to mark duplicates (optional)
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            // Check if this element has appeared before
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not found before, check duplicates ahead
            if (!isDuplicate) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i] == arr[k]) {
                        System.out.println(arr[i]);
                        foundDuplicate = true;
                        break;
                    }
                }
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
    }
}
   

