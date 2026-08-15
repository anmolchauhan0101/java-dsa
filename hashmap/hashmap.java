package hashmap;
import java.util.*;
public class hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 100);
        map.put("china", 200);
        map.put("US", 300);

        System.err.println(map);

        //updation
        map.put("china", 400);
        System.out.println(map);


        //searching
        if(map.containsKey("china")){
            System.out.println("china is present");
        }   
        else{
            System.out.println("china is not present");
        }

        //getting key value
        int a = map.get("china");
        System.out.println(a);

        //iteration
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        //iterating key only
        Set <String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key);
        }

        // removing
        map.remove("china");
        System.out.println(map);
    }
    
}
