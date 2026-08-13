public class uniqueelement {
    static int uniqueelement(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;  

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,1,2,3,4};
        System.out.println(uniqueelement(arr));
    }
}
