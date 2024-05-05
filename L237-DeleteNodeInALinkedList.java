// https://leetcode.com/problems/delete-node-in-a-linked-list
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = new ListNode();
        while (node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }
}
