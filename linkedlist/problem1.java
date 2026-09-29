// question to find nth node from last and to delete it 
public class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next;
    }
}
class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        //size of LL
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        //if n equals size of LL
        if(n == size){
            return head.next;
        }

        //find node 1 before the nth node from last
        int indexToSearch = size-n;
        ListNode prev = head;
        int i =1;
        while(i< indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;

    }
}
