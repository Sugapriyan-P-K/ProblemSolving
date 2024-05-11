// https://leetcode.com/problems/trapping-rain-water/
class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int l = 0, r = length - 1;
        int leftMax = height[l], rightMax = height[r], res = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                l += 1;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r -= 1;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}
