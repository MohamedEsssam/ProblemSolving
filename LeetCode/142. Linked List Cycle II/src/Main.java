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
        var list  = new ListNode(3);
        var list1 = new ListNode(2);
        var list2 = new ListNode(0);
        var list3 = new ListNode(-4);

        list.next = list1;
        list1.next = list2;
        list2.next = list3;


        // Get a reference to 30
        var node = list1;

        // Create the loop
        list3.next = node;
        var s = solution.detectCycle(list);
        main.printList(s);

    }
}