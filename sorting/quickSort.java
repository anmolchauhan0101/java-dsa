public class quickSort{
    static void displayArr(int arr[]){
        for(int val : arr){
            System.out.print(val+" ");
        }
    } 
    static void swap(int arr[],int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    static int partition(int [] arr, int low, int end ){
        int pivot = arr[low];
        int count = 0;
        for(int i = low+1; i<=end; i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = low + count;
        swap(arr,low,pivotIndex);
        int i = low;
        int j = end;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void quickSort(int arr[] , int low, int end){
        if(low>=end){
            return;
        }
        int pivot = partition(arr,low,end);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,end);

    }
    public static void main(String[] args){
        int [] arr = {10,4,6,10,3,7,8};
        System.out.println("array before sorting");
        displayArr(arr);
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.println("Array after sorting");
        displayArr(arr);
    }    
}