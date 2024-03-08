/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Runtime 1 ms Beats 100.00% of users with Java
// Memory 43.88 MB Beats 97.91% of users with Java
class Solution_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      // creating an empty node
        ListNode result = new ListNode();
        ListNode head = result;
        ListNode tail = result;
        int carry = 0;
        ListNode l1Current = l1;
        ListNode l2Current = l2;
      // want to continue if one of them emptied, stop when both are empty
        while (l1Current != null || l2Current != null) {

            int v1 = 0;
            int v2 = 0;
            int total = 0;
          // if one of them emptied fill the place with 0
            if (l1Current == null) {
                v1 = 0;
            } else {
                v1 = l1Current.val;
                l1Current = l1Current.next;
            }
            if (l2Current == null) {
                v2 = 0;
            } else {
                v2 = l2Current.val;
                l2Current = l2Current.next;
            }

            total = v1 + v2 + carry;
            if (total > 9) {
                total = total % 10;
                carry = 1;
            } else {
                carry = 0;
            }
          // create new node for the new added value, you might see head has no value. we will remove the head.
            ListNode next = new ListNode();
            next.val = total;
            tail.next = next;
            tail = next;
        }
      // [99 + 99 = (1)98] after while loop we check if carry is 1. if so then add another node to place 1. 
        if (carry > 0) {
            ListNode next = new ListNode();
            next.val = carry;
            tail.next = next;
            tail = next;
        }
      // since we started adding value from head.next
        return head.next;

    }
}
