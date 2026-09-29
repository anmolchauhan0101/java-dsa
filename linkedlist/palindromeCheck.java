class Solution{
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
        ListNode a = head;
        ListNode b = head;
        while(a.next != null && a.next.next != null){
            a = a.next.next;
            b = b.next;
        }
        return b;
    }
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next ==  null){
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode secodHalfStart = reverse(middle.next);

        ListNode firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
}