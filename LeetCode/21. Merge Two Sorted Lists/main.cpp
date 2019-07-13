#include "Solution.h"



void printList(ListNode *n)
{
    while (n != NULL)
    {
        std::cout << n->val << " ";
        n = n->next;
    }
}

int main() {
    ListNode *head = new ListNode(1);
    ListNode *first = new ListNode(2);
    ListNode *second = new ListNode(4);

    ListNode *third = new ListNode(1);
    ListNode *fourth = new ListNode(3);
    ListNode *fifth = new ListNode(4);
    //ListNode *six = new ListNode(20);

    head->next = first;
    first->next = second;
    second->next = NULL;

    third->next = fourth;
    fourth->next = fifth;
    fifth->next = NULL;
    //six->next = NULL;
    Solution solution;

    ListNode *temp = solution.mergeTwoLists(head, third);

    printList(temp);

    return 0;
}