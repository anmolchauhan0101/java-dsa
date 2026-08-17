package array.prefixsum;
import java.util.Scanner;

//brute force approach
// public class rangesum{
//     static int rangesum(int arr[], int target){
//         int sum =0;
//         for(int i =0; i<target; i++){
//             sum += arr[i];
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int n = sc.nextInt();
//         System.out.println("Enter the elements of array");
//         int arr[] = new int[n];
//         for(int i =0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the target index");   
//         int target = sc.nextInt();
//         int sum = rangesum(arr, target);
//         System.out.println("The sum of elements from index 0 to " + target + " is: " + sum);

//     }
// }

// brute force approach will have a time complexity of O(n) for each query. If we have multiple queries, this can become inefficient.

//optimized appraoch using prefix sum
public class rangesum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int l = 2;
        int r = 4;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        // Build prefix sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int rangesum;
        if (l == 0) {
            rangesum = prefix[r];
        } else {
            rangesum = prefix[r] - prefix[l - 1];
        }
        System.out.println(rangesum);
    }
}