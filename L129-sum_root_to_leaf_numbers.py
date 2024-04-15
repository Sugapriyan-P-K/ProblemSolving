# https://leetcode.com/problems/sum-root-to-leaf-numbers/
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        def makeSum(root, cur, wholeSum):
            if (not root):
                return wholeSum
            cur = cur * 10 + root.val
            if (not root.left and not root.right):
                wholeSum += cur
                cur = 0
                return wholeSum
            wholeSum = makeSum(root.left, cur, wholeSum)
            wholeSum = makeSum(root.right, cur, wholeSum)
            return wholeSum
        return makeSum(root, 0, 0)
