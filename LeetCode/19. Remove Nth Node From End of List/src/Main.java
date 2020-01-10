public class Main {
    void printList(ListNode n)
    {
        while (n != null)
        {
            System.out.println(n.val+" ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Solution solution = new Solution();
        ListNode listNode = new ListNode( 1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);

        listNode.next = null;
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = null;
        var s = solution.removeNthFromEnd(listNode,1);
        main.printList(s);

    }
}
