// https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0, prefixSum = 0, minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            r = i;
            while (prefixSum > target) {
                minLength = Math.min(minLength, r - l + 1);
                prefixSum -= nums[l++];
            }
            if (prefixSum == target) {
                minLength = Math.min(minLength, r - l + 1);
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
