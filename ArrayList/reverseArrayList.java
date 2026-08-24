import java.util.*;
public class reverseArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println("Original ArrayList: " + list);

        // reverse of arraylist using loop temporary element
        // int low = 0;
        // int high = list.size() - 1;
        // while(low < high){
        //     int temp = list.get(low);
        //     list.set(low, list.get(high));
        //     list.set(high, temp);
        //     low++;
        //     high--;
        // }

        //reverse of arraylist using Collections.reverse() method
        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);

        //sorting using Collections.sort() method
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        //string array list

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Apple");
        list2.add("Mango");
        System.out.println("Original ArrayList: " + list2);

        // reverse of arraylist using Collections.reverse() method
        Collections.reverse(list2);
        System.out.println("Reversed ArrayList: " + list2);
        //sorting using Collections.sort() method
        Collections.sort(list2);
        System.out.println("Sorted ArrayList: " + list2);
        
    }
}
