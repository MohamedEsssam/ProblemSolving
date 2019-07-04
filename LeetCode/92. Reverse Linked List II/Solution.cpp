//
// Created by mohamedessam on 7/4/19.
//
#include <iostream>
#include "Solution.h"


ListNode* Solution::reverseBetween(ListNode* head, int m, int n) {
    ListNode *current = head, *prev = NULL ;
    if(m >= n){return head;}

    while (m > 1){
        prev = current;
        current = current->next;

        m--;
        n--;
    }
    ListNode *tempHead = prev, *tail = current, *tempNode = NULL;
    while (n>0){
        tempNode = current->next;
        current->next = prev;
        prev = current;
        current = tempNode;
        n--;
    }
    if(tempHead !=NULL) {
        tempHead->next = prev;
    }else{
        head = prev;
    }
    tail->next = current;
    return head;
}