class Solution {

/*
*   Mapping ----->    1->2->3->3->3->3->4
*                     1->2>4
*
*/
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode TempNode = new ListNode(0);
        TempNode.next = head;

        ListNode prev = TempNode;
        prev.next = head;
        ListNode current = head;

        while (current != null && current.next != null) {
            boolean flag = false;
            while (current.next !=null && current.val == current.next.val) {
                current.next = current.next.next;
                flag = true;
            }
            if (flag){
                prev.next = current.next;
                if (current == head) head =current.next;
                flag = false;
            }else {
                prev = prev.next;
            }
            current = current.next;
        }
        return head;
    }
}