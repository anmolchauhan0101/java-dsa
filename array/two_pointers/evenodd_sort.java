package array.two_pointers;

public class evenodd_sort {
    static int [] sort(int [] arr){
        int n = arr.length;
        int low =0;
        int high = n-1;
        while(low<high){
            if(arr[low]%2 == 1 && arr[high]%2 == 0){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
            else if(arr[low]%2 == 0){
                low++;
            }
            else if(arr[high]%2 == 1){
                high--;
            }
        }
        return arr;
    }
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6};
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
