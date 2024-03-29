# https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times
class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        left, right =0, 0
        count, frequency, maxi = 0, 0, 0
        length = len(nums)
        while (right < length):
            if (nums[right] > maxi):
                maxi = nums[right]
                count = 0
                left = 0
                frequency = 1
            else:
                if (nums[right] == maxi):
                    frequency += 1
            while (left < length and frequency == k):
                if (nums[left] == maxi):
                    frequency -= 1
                left += 1
                count += 1 + (length - (right + 1))
            right += 1
        return count
