//
// Created by mohamedessam on 7/14/19.
//

#ifndef INC_21__MERGE_TWO_SORTED_LISTS_SOLUTION_H
#define INC_21__MERGE_TWO_SORTED_LISTS_SOLUTION_H
#include <iostream>

struct ListNode {
         int val;
         ListNode *next;
         ListNode(int x) : val(x), next(NULL) {}
     };

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2);
};


#endif //INC_21__MERGE_TWO_SORTED_LISTS_SOLUTION_H
