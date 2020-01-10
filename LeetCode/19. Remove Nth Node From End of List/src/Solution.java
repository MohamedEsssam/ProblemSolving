class Solution {

    public ListNode getPrevious(ListNode head, ListNode node){
        ListNode current = head;
        while(current != null){
            if(current.next == node)return current;
            current = current.next;
        }
        return null;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0; i < n - 1 ; i++){
            fast = fast.next;
            if(fast == null)
                return null;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode pre = getPrevious(head, slow);
        slow = pre;
        pre= getPrevious(head, pre);
        if (pre == null)
            return slow.next;
        System.out.println("pre "+pre.val);
        System.out.println("slow "+slow.val);
        pre.next = slow.next;
        slow.next = null;
        return head;
    }
}