public class selection {
    public static void main(String[] args) {
        int[] arr = { 12, 43, 23, 421, 11, 45, 53 };
        selectionsort(arr);
    }

    static void selectionsort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            swap(i,min,arr);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void swap(int i, int min,int[] arr) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
