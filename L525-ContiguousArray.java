// https://leetcode.com/problems/contiguous-array/
class Solution {
    public int findMaxLength(int[] nums) {
        int prefixSum = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                prefixSum -= 1;
            } else {
                prefixSum += 1;
            }
            if (prefixSum == 0) {
                maxLen = i + 1 > maxLen ? i + 1 : maxLen;
            } else {
                int temp = map.getOrDefault(prefixSum, -1); 
                if (temp != -1) {
                    maxLen = i - temp > maxLen ? i - temp : maxLen;
                    continue;
                } 
            }
            map.put(prefixSum, i);
        }
        return maxLen;
    }
}
