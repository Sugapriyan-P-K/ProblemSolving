// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1, length = nums.length, minimum = Integer.MAX_VALUE;
        if (nums.length == 1) {
            return nums[0];
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < minimum) {
                minimum = nums[mid];
            }
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
                continue;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] < minimum) {
                    minimum = nums[left];
                }
                left = mid + 1;
            }
            else {
                if (nums[mid] <= nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return minimum;
    }
}
