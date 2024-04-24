// https://leetcode.com/problems/reverse-linked-list-ii/
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;
        for(int i = 0; i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode p = new ListNode();
        for(int i = 0; i < right - left + 1; i++) {
            ListNode tempNext = curr.next;
            curr.next = p;
            p = curr;
            curr = tempNext;
        }
        prev.next.next = curr;
        prev.next = p;
        return dummy.next;
    }
}
