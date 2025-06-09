public class Day5Q10Array 
{

    public static void main(String[] args) {
        int[] arr = {15, 22, 8, 19, 31, 4};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest; // update second highest
                highest = num;           // update highest
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;     // update second highest if in between
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest value found (array may have all equal elements).");
        } else {
            System.out.println("Second highest value is: " + secondHighest);
        }
    }
}
   
