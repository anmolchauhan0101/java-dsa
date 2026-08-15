package array.two_pointers;

// sort of 0/1 array using two pointer approach

// brute force approach is to count the number of 0's and 1's and then fill the array with 0's and 1's accordingly
// public class main {
//     static int[] sort(int arr[]){
//         int zero_count = 0;
//         int one_count = 0;
//         int n = arr.length;
//         for(int i =0; i<n; i++){
//             if(arr[i] == 0){
//                 zero_count++;
//             }
//             else{
//                 one_count++;
//             }
//         }
//         for(int i =0; i<n; i++){
//             if(i<zero_count){
//                 arr[i] = 0;
//             }
//             else{
//                 arr[i] = 1;
//             }
//         }
//         return arr;
//     }
//     public static void main(String [] args){
//         int arr[] = {0,1,0,1,0,1};
//         sort(arr);
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// optimized approach is to use two pointer approach where we will have two pointers one at the start and one at the end of the array and we will swap the elements if the element at start pointer is 1 and element at end pointer is 0 and then we will move the pointers accordingly

public class main{
    static int [] sort(int [] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            if(arr[low] ==1 && arr[high] == 0){
                arr[low] =0;
                arr[high] =1;
                low++;
                high--;
            }
            else {
                low++;
                high--;
            }
        }
        return arr;
    }
    public static void main(String [] args){
        int arr[] = {0,1,0,1,0,1};
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
