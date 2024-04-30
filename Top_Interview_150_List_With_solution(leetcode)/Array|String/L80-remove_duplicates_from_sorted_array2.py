# https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 0
        length = len(nums)
        for i in range(length):
            if (i < 2 or nums[i] > nums[k - 2]):
                nums[k] = nums[i]
                k += 1
        return k
