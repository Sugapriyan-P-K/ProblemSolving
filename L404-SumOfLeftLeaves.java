// https://leetcode.com/problems/sum-of-left-leaves/


class Solution {
    public static int search(TreeNode node, int sum, TreeNode parent) {
        if (node == null) {
            return sum;
        }
        if (parent != null && parent.left == node) {
            if (node.left == null && node.right == null) {
                sum += node.val;
            }
        }
        parent = node;
        sum = search(node.left, sum, parent);
        sum = search(node.right, sum, parent);
        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return search(root, 0, null);
    }
}
