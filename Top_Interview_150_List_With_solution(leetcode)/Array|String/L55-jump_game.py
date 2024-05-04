# https://leetcode.com/problems/jump-game/
class Solution:
    def canJump(self, nums: List[int]) -> bool:
        numLen = len(nums)
        goal = numLen - 1
        for idx in range(numLen - 1, -1, -1):
            if idx + nums[idx] >= goal:
                goal = idx
        return True if goal == 0 else False
