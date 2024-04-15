# https://leetcode.com/problems/sum-of-left-leaves/
class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        def search(root, add, parent):
            if (not root):
                return add
            if (parent and parent.left == root):
                if (not root.left and not root.right):
                    add += root.val
            parent = root
            add = search(root.left, add, parent)
            add = search(root.right, add, parent)
            return add
        return search(root, 0, None)
