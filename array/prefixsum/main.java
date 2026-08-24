package array.prefixsum;
// public class main{
//     public static void main(String[] args){
//         int arr[] = {2,4,5,3,6,1};
//         int n = arr.length;
//         int prefix[] = new int[n];
//         prefix[0] = arr[0];
//         for(int i = 1; i < n; i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }
//         for(int i = 0; i < n; i++){
//             System.out.print(prefix[i] + " ");
//         }
//     }
// }

//without declaring new array

public class main{
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5};
        int n = arr.length;
        // arr[0] = arr[0];
        for(int i =1; i<n; i++){
            
            arr[i]= arr[i-1] + arr[i];
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }


    }
}