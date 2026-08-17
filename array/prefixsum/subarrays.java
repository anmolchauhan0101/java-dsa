package array.prefixsum;
// Array into 2 subarrays with equal sum
public class subarrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = arr[0];
        suffix[n - 1] = arr[n - 1];
        // Build prefix sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        // Build suffix sum
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }
        // Check possible split
        for (int i = 0; i < n - 1; i++) {
            if (prefix[i] == suffix[i + 1]) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}