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
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        while (true) {
            ListNode curr  = prev;
            for (int i = 0; i < k && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null) break;

            ListNode start = prev.next;
            ListNode nextStart = curr.next;
            curr.next = null;
            prev.next = reverseLL(start);
            start.next = nextStart;
            prev = start;
        }
        return dummy.next;
    }
    public ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr =head;
        ListNode nex = curr;
        while(curr != null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
}