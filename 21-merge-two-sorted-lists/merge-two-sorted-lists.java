/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1 == null || list2 == null)
        return list1 != null ? list1:list2;

        ListNode dummy = new ListNode(-1);   
        ListNode current;
        current = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode next;
        while(p1!=null && p2 != null){
            if(p1.val <= p2.val){
                current.next = p1;
                p1 = p1.next;
            }else{
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        current.next  = p1 != null ? p1: p2;
        return dummy.next;
    }
    
}