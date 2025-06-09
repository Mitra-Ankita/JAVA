public class Day5Q14Array{ 
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 10, 40, 50, 30};
        int n = arr.length;
        int[] temp = new int[n];
        int newIndex = 0;
        // Loop to find unique elements
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            // Check if arr[i] is already in temp array
            for (int j = 0; j < newIndex; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not duplicate, add to temp
            if (!isDuplicate) {
                temp[newIndex] = arr[i];
                newIndex++;
            }
        }   // Print result
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newIndex; i++) {
            System.out.print(temp[i] + " ");
        }
    
}
}
