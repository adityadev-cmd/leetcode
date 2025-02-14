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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //get prev and last pointer to a and b
        int count = 0;
        ListNode ptr = list1;
        ListNode first = null;
        ListNode last = null;

        for (int i = 1; i < a ;i ++){
            ptr = ptr.next;
        }
        last = ptr.next;
        for (int i =0 ;i <(b-a +1) ; i++){
            last = last.next;
        }
        // find last position of list2;
        ListNode ptr2 = list2;
        ListNode lastlist2 = null;
        while(ptr2.next != null){
            ptr2 = ptr2.next;
        }
        

        ptr.next = list2;
        ptr2.next = last;

        return list1;


    }
}