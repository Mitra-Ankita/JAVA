public class Day5Q7Array {

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50, 60, 70};

        // Calculate size of new array (half of original, rounded up)
        int newSize = (original.length + 1) / 2;
        int[] result = new int[newSize];

        int index = 0;
        // Copy elements at even indices only
        for (int i = 0; i < original.length; i += 2) {
            result[index] = original[i];
            index++;
        }

        // Print result
        System.out.println("Array after removing every second element:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}