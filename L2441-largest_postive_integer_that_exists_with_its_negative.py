# https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
# may 2, 2024 - daily challenge
class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        ans = -1
        nums.sort()
        l, r = 0, len(nums) - 1
        while (l < r):
            if (-1 * nums[l] == nums[r]):
                return nums[r]
            if (nums[l] > 0):
                return -1
            if (-1 * nums[l] < nums[r]):
                r -= 1
            else:
                l += 1
        return -1
