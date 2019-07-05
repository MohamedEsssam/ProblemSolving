//
// Created by mohamedessam on 7/5/19.
//

#ifndef INC_203__REMOVE_LINKED_LIST_ELEMENTS_SOLUTION_H
#define INC_203__REMOVE_LINKED_LIST_ELEMENTS_SOLUTION_H
#include <iostream>

struct ListNode {
         int val;
         ListNode *next;
         ListNode(int x) : val(x), next(NULL) {}
     };
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val);
};


#endif //INC_203__REMOVE_LINKED_LIST_ELEMENTS_SOLUTION_H
