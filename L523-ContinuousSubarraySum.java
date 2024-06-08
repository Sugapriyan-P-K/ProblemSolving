// https://leetcode.com/problems/continuous-subarray-sum/
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0, length = nums.length, prev = -1;
        for (int idx = 0; idx < length; idx++) {
            prefixSum += nums[idx];
            prefixSum %= k;
            prev = map.getOrDefault(prefixSum, -2);
            if (prev != -2) {
                if (idx - prev > 1)
                    return true;
            }
            else {
                map.put(prefixSum, idx);
            }
        }  
        return false;
        
    }
}
