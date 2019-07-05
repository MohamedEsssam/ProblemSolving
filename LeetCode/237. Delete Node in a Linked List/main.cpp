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
    ListNode *head =new ListNode(4);
    ListNode *first =new ListNode(5);
    ListNode *second =new ListNode(1);
    ListNode *third =new ListNode(9);

    head->next = first;
    first->next = second;
    second->next = third;
    third->next = NULL;

    printList(head);
    std::cout<<""<< std::endl;
    Solution solution;
    solution.deleteNode(second);

    printList(head);
}