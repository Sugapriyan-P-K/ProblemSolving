// https://leetcode.com/problems/product-of-array-except-self/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int Len = nums.length,
            t = 1,
            p = 1;
        int[] res = new int[Len];
        for (int i = 0; i < Len; i++) {
            res[i] = p;
            p *= nums[i];
        }
        for (int i = Len - 1; i > -1; i--) {
            res[i] *= t;
            t *= nums[i];
        }
        return res;
    }
}
