# https://leetcode.com/problems/reverse-linked-list-ii/
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        prev, curr = dummy, head
        for i in range(left - 1):
            prev, curr = curr, curr.next
        p = None
        for i in range(right - left + 1):
            tempNext = curr.next
            curr.next = p
            p = curr
            curr = tempNext
        prev.next.next = curr
        prev.next = p 
        return dummy.next
