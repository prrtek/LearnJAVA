public class insertion {

    public static void main(String[] args) {
        int[] arr = {12, 43, 23, 421, 11, 45, 53};
        insertionSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Key element to be inserted
            int j = i - 1; // Start comparing with the previous element

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert the key into its correct position
        }
    }
}

