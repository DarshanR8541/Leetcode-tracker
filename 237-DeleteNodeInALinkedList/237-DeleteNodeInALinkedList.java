// Last updated: 7/9/2026, 9:19:54 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    node.val=node.next.val;
    node.next=node.next.next;    
    }
}