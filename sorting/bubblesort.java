package sorting;

public class bubblesort {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            boolean flag = false;
            for(int j =0; j<n-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    flag = true;
                }
            }
            if(flag == false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,4,6,3,8, 0, -1 , 33};
        
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
}

