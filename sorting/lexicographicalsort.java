public class lexicographicalsort {
    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for(int i =0; i<n-1; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(fruits[j].compareTo(fruits[min]) < 0){
                    min = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min];
            fruits[min] = temp;
        }
    }
    public static void main(String[] args){
        String[] fruits= {"apple", "kiwi", "orange", "banana"};
        sortFruits(fruits);
        for(String val : fruits){
            System.out.print(val + " ");
        }
    }
}
