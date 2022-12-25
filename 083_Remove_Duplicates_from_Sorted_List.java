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


// Runtime 0 ms Beats 100%
// Memory 41.7 MB Beats 91.66%

// N -> N -> N -> N // 1 -> 1 -> 2 -> 3 -> 3
class Solution_83{
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode previousNode = head;
        ListNode currentNode = head.next;
        int value = head.val;

        while(currentNode != null){
            if(currentNode.val == value){
                previousNode.next = currentNode.next;
                currentNode.next = null;
                currentNode = previousNode.next;
            }else {
                value = currentNode.val;
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

