// https://leetcode.com/problems/rotate-array/
class Solution {
    public void rotate(int[] nums, int k) {
        int numLen = nums.length;
        k %= numLen;
        reverse(nums, 0, numLen - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, numLen - 1);        
    }
    
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
