public class movezero{
    static void moveZero(int [] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j] ==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = { 0,2,0,4,3,1,0,8,0};
        moveZero(arr);
        for(int i : arr){
            System.out.print(i +" ");
        }
    }
}