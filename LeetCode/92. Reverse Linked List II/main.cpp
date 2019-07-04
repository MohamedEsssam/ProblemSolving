#include <iostream>

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
    ListNode *first = new ListNode(3);
    ListNode *second = new ListNode(4);
    ListNode *third = new ListNode(5);
    ListNode *fourth = new ListNode(7);
    ListNode *fifth = new ListNode(9);
    ListNode *six = new ListNode(20);

    head->next = first;
    first->next = second;
    second->next = third;
    third->next = fourth;
    fourth->next = fifth;
    fifth->next = six;
    six->next = NULL;
    std::cout <<"Old List : "<<std::endl;
    printList(head);
    std::cout <<""<<std::endl;
    Solution solution;
    solution.reverseBetween(head, 2, 7);
    printList(head);

    return 0;
}