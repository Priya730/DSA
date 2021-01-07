/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode pointer_A = headA;
        ListNode pointer_B = headB;
        
        while(pointer_A != pointer_B){
            
            if(pointer_A == null){
                pointer_A = headB;
            }else{
                pointer_A = pointer_A.next;
            }
            
            if(pointer_B == null){
                pointer_B = headA;
            }else{
                pointer_B = pointer_B.next;
            }
        }
        
        return pointer_A;
    }
}
