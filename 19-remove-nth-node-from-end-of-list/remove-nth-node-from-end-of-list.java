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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    // two loops - first find the size and then subtract size-n -> answer is the node whose next pointer we have to change, 2nd loop is abt moving to (size-n)th node and updating next pointer.
    int size = 0;
    ListNode temp = head;
    while(temp != null){
        size++;
        temp = temp.next;
    }
    if(size == n){
        return head.next;
    }
    int diff = size - n;
    temp = head;
    if(n == 1 && size == 2){
        head.next = null;
        return head;
    }
    while(diff>1){
        temp = temp.next;
        diff--;
    }
    temp.next = temp.next.next;
    return head;
    }
}