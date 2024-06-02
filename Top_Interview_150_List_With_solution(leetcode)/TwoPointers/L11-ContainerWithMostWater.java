// https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
        int l = 0,
            r = height.length - 1,
            res = 0,
            area = 0;
        while (l < r) {
            area = (r - l) * (height[l] < height[r] ? height[l] : height[r]);
            res = area > res ? area : res;  
            if (height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return res;
    }
}
