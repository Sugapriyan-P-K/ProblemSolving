# https://leetcode.com/problems/rotate-array/
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        numLen = len(nums)
        def swap(l, r):
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
            return [l, r]
        if k == numLen or numLen == 1:
            return
        if k > numLen:
            k = k % numLen
        l, r = 0, numLen - 1
        while l < r:
            l, r = swap(l, r)
        l, r = 0, k -1
        while l < r:
            l, r = swap(l, r)
        l, r = k, numLen - 1
        while l < r:
            l, r = swap(l, r)
