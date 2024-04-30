// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, k = 0, length = nums.length;
        for (i = 0; i < length; i++) {
            if (i < 2 || nums[i] > nums[k - 2])
                nums[k++] = nums[i];
        }
        return k;
    }
}
