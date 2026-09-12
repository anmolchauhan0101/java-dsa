import java.util.*;
public class stringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.delete(5, 10);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
