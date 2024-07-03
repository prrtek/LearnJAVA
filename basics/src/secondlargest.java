public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 12, 3, 1, 3, 5, 53 };
        secondlargestf(arr);
    }

    static void secondlargestf(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > smax) {
                smax = arr[i];
            }
        }
        
        System.out.println(smax);
    }
}
