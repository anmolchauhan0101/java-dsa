package searching;

public class binarysearch {
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};
        int target = 20;
         int low = 0;
         int high = arr.length-1;
         while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                System.out.println("element found");
                return;
            }
            else if(arr[mid]<target){
                low = mid +1;
            }
            else{
                high = mid -1;
            }

         }
         System.out.println("element not found");
    }
}
