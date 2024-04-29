# https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 1
        l, r = 0, 1
        while(l < len(nums) and r < len(nums)):
            if nums[l] == nums[r]:
                nums.remove(nums[r])
            else:
                l = r
                r += 1
                k += 1
        return k
