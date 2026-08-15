package array.reverse;

// public class reverse {
//     static int[] reverse(int arr[]){
//         int n = arr.length;
//         int temp[] = new int[n];
//         int j =0;
//         for(int i = n-1; i>=0; i--){
//             temp[j++] = arr[i];

//         }
//         return temp;
//     }
//     public static void main(String[] args){
//         int arr[] = {1,2,3,4,5};
//         int temp[] = reverse(arr);
//         for(int i =0; i<temp.length; i++){
//             System.out.print(temp[i]+" ");
//         }
//     }
// }

import java.util.Arrays;
public class reverse {
    static void reverse(int arr[]) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}