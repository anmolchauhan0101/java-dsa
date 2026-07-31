package searching;

public class linearsearch {
    public static void main(String[] args){
        int [] arr = {10,20,22,30,40,50};
        int target = 20;
        for(int i =0; i< arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    
}
