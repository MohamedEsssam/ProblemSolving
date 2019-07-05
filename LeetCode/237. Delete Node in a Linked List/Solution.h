//
// Created by mohamedessam on 7/5/19.
//

#ifndef INC_237__DELETE_NODE_IN_A_LINKED_LIST_SOLUTION_H
#define INC_237__DELETE_NODE_IN_A_LINKED_LIST_SOLUTION_H
#include <iostream>


struct ListNode {
         int val;
         ListNode *next;
         ListNode(int x) : val(x), next(NULL) {}
     };


class Solution {
public:
    void deleteNode(ListNode* node);
};

#endif //INC_237__DELETE_NODE_IN_A_LINKED_LIST_SOLUTION_H
