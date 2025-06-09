public class Day5Q8Array {
    
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int element = 25;   // Element to insert
        int position = 2;   // Position to insert (0-based index)
        // Check if position is valid
        if (position < 0 || position > original.length) {
            System.out.println("Invalid position!");
            return;
        }
        // Create new array with one extra size
        int[] newArray = new int[original.length + 1];
        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArray[i] = original[i];
        }
        // Insert new element at the position
        newArray[position] = element;
        // Copy the rest of the elements after position
        for (int i = position; i < original.length; i++) {
            newArray[i + 1] = original[i];
        }
        // Print new array
        System.out.println("Array after insertion:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}

