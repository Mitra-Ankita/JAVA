public class Day5Q3Array 
{
    public static void main(String[] args) {
        int[] numbers = {123, 45, 9, 100, 78};

        System.out.println("Sum of digits for each array element:");
        
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int sum = 0;

            // Calculate sum of digits
            while (num > 0) {
                sum += num % 10; // get last digit
                num = num / 10;  // remove last digit
            }

            System.out.println("Number: " + numbers[i] + " → Sum of digits: " + sum);
        }
    }
}

