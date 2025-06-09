public class Day5Q1Array 
{
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Swap if next element is greater
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Print sorted array
        System.out.println("Array in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

