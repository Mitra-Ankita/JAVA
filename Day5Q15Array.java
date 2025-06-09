public class Day5Q15Array 
{
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 5, 1, 2};

        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Update if current count is greater than maxCount
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }

        System.out.println("Most frequent number is: " + mostFrequent);
        System.out.println("It appears " + maxCount + " times.");
    }
}
 
