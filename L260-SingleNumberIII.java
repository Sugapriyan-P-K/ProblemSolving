// https://leetcode.com/problems/single-number-iii/

class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        int xor = 0;
        for (int num: nums) {
            xor ^= num;
        }
        int bitNo = 0;
        while (true) {
            if ((xor & (1 << bitNo)) != 0)
                break;
            bitNo++;
        }
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & (1 << bitNo)) != 0) {
                res[0] ^= nums[i];
            } else {
                res[1] ^= nums[i];
            }
        }
        return res;
    }
}
