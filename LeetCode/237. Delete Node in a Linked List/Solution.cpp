//
// Created by mohamedessam on 7/5/19.
//

#include "Solution.h"

void Solution::deleteNode(ListNode* node){
    while (node->next !=NULL) {
        node->val = node->next->val;
        node->next = node->next->next;
    }
}