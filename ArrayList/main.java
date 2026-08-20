import java.util.ArrayList;
public class main{
    public static void main(String[] args){
        //declaration of array list
        ArrayList<Integer> list = new ArrayList<>();
         list.add(5);
         list.add(1);
         list.add(3);
         list.add(2);
         System.out.println(list);
         System.out.println(list.get(1));

         //print with loop
         for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
         }

         // element at a specific index
         list.add(1, 100);
         System.out.println(list);

        //modify an element at a specific index
        list.set(1, 200);
        System.out.println(list);

        //remove an element at a specific index
        list.remove(1);
        System.out.println(list);

        // removing an element without index value
        list.remove(Integer.valueOf(5));
        System.out.println(list); 

        //check if element exists in the list
        System.out.println(list.contains(3));
    }
}

