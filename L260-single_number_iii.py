# https://leetcode.com/problems/single-number-iii/
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        length = len(nums)
        if length <= 2:
            return nums
        xor = 0
        for num in nums:
            xor ^= num
        bitNo = 0
        while (True):
            if ((xor & (1 << bitNo)) != 0):
                break
            bitNo += 1
        one, two = 0, 0
        for num in nums:
            if ((num & (1 << bitNo)) != 0):
                one ^= num
            else:
                two ^= num
        return [one, two]
