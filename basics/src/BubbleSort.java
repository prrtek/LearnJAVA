public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 43, 23, 421, 11, 45, 53};
        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Loop through each element in the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare each pair of adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
