public class main {

    public void printList(ListNode head)
    {
        ListNode n = head;
        while (n != null)
        {
            System.out.print(n.val+" ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode( 1);
        ListNode third = new ListNode(2);
//       ListNode fourth = new ListNode(3);
////
//        ListNode fifth = new ListNode(3);
        //ListNode six = new ListNode(3);

        //ListNode seven = new ListNode(4);
        //ListNode fourth = new ListNode(1);

     first.next = second;
     second.next = third;
       third.next = null;
//       fourth.next = fifth;
//       fifth.next = null;
       //six.next = seven;
       //seven.next = null;

        main main = new main();
        Solution solution = new Solution();
        solution.deleteDuplicates(first);
        main.printList(first);

    }
}
