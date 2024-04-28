// https://leetcode.com/problems/remove-element/
class Solution {
    public void swap (int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1, count = 0;
        while (l <= r) {
            if (nums[l] == val && nums[r] == val) {
                r -= 1;
                count += 1;
            } else if (nums[l] == val) {
                swap(nums, l, r);
                l += 1;
                r -= 1;
                count += 1;
            } else {
                l += 1;
            }
        }
        return nums.length - count;
    }
}
