//
// Created by mohamedessam on 7/5/19.
//

#include "Solution.h"

ListNode* Solution::removeElements(ListNode *head, int val) {

    while(head!=NULL && head->val==val)
        head=head->next;
    if(head==NULL)
        return head;
    ListNode* current = head;
    while(current->next!=NULL){
        if(current->next->val==val)
            current->next=current->next->next;
        else
            current=current->next;
    }
    return head;
}
