// https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times
class Solution {
    public long countSubarrays(int[] nums, int k) {
        long count = 0;
        int left = 0, right = 0, frequency = 0, length = nums.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        while (right < length) {
            if (nums[right] == max) {
                frequency++;
            }
            int incRight = (length - (right + 1)) + 1;
            while (left < length && frequency == k) {
                if (nums[left] == max) {
                    frequency--;
                }
                left++;
                count += incRight;
            }
            right++;
        }
        return count;
    }
  public long countSubarrays2(int[] nums, int k) {
        long count = 0;
        int left = 0, right = 0, frequency = 0, length = nums.length;
        int max = 0;
        while (right < length) {
            if (nums[right] > max) {
                max = nums[right];
                count = 0;
                frequency = 1;
                left = 0;
            } else {
                if (nums[right] == max) {
                    frequency++;
                }
            }
            int incRight = (length - (right + 1)) + 1;
            while (left < length && frequency == k) {
                if (nums[left] == max) {
                    frequency--;
                }
                left++;
                count += incRight;
            }
            right++;
        }
        return count;
    }
}
