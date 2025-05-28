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
   public boolean isPalindrome(ListNode head) {
    Deque<Integer> stack = new ArrayDeque<>();
    ListNode current = head;
    while(current != null){
        stack.push(current.val);
        current = current.next;
    }
    current = head;
    while(!stack.isEmpty()){
        if(stack.pop() != current.val)
            return false;
        current = current.next;
    }
    return true;
   }
}

/** public boolean isPalindrome(ListNode head) {
        ListNode tail = reverseList(head);
        ListNode left = head;
        ListNode right = tail;

        while(left!=null){
            if(left.val != right.val)
            return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode after = null;
        while(current != null) {
                 after = current.next;
                current.next = prev;
                prev = current;
                current = after;
        }

        return prev;
    } */