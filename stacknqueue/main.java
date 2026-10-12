// basic of stack

package stacknqueue;
import java.util.*;
// public class main{
//     public static void main(String[] args){
//         Stack<Integer> st = new Stack<>();
//         st.push(1);
//         st.push(2);
//         st.push(3);

//         System.out.println(st.peek());
//         System.out.println(st.pop());
//         System.out.println(st.isEmpty());
//     }
// }


// basic of queue

public class main{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.isEmpty());
    }
}