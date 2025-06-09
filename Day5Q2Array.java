public class Day5Q2Array {
    
    public static void main(String[] args) {
        int[] numbers = {5, 2, 7, 8, 4, 3, 9};

        int evenSum = 0;
        int oddSum = 0;

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];  // Add to even sum
            } else {
                oddSum += numbers[i];   // Add to odd sum
            }
        }

        // Print results
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }
}

