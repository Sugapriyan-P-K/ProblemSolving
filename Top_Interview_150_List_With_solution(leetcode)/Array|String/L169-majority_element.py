# https://leetcode.com/problems/majority-element/
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        length, elem, count = len(nums), nums[0], 1
        n_by_two = length // 2
        for i in range(1, length):
            if (count == 0):
                count = 1
                elem = nums[i]
            elif (elem == nums[i]):
                count += 1
            else:
                count -= 1
        count = 0
        for i in range(length):
            if (nums[i] == elem):
                count += 1
            if (count > n_by_two):
                return elem
        return -1
