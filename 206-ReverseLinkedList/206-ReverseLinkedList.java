// Last updated: 7/9/2026, 9:20:02 AM
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
    public ListNode reverseList(ListNode head) {
        
        ListNode marri= null;
        ListNode node = null;
        ListNode curr = head;

        while(curr != null)
        {
            node = curr.next;

            curr.next = marri;

            marri = curr;
            curr = node;
        }

        return marri;
    }
}