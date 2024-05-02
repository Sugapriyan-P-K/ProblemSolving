// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
// may 2, 2024 - daily challenge
class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (-1 * nums[l] == nums[r]) {
                return nums[r];
            }
            if (nums[l] > 0) {
                return -1;
            } else if (-1 * nums[l] < nums[r]) {
                r -= 1;
            } else {
                l += 1;
            }
        }
        return -1;
    }
}
