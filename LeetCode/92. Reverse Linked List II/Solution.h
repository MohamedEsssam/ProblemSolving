//
// Created by mohamedessam on 7/4/19.
//

#ifndef LEETCODE_SOLUTION_H
#define LEETCODE_SOLUTION_H
#include <iostream>


struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};


class Solution {
public:
     ListNode*reverseBetween(ListNode* head, int m, int n);
};


#endif //LEETCODE_SOLUTION_H
