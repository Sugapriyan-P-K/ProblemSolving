// https://leetcode.com/problems/sum-root-to-leaf-numbers/
class Solution {
    public int makeSum(TreeNode root,int cur,int sum) {
        if (root == null) {
            return sum;
        }
        cur = cur * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += cur;
            cur = 0;
        }
        sum = makeSum(root.left, cur, sum);
        sum = makeSum(root.right, cur, sum);
        return sum;
    }
    public int sumNumbers(TreeNode root) {
        return makeSum(root, 0, 0);
    }
}
