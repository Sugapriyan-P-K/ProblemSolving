# https://leetcode.com/problems/sum-of-all-subset-xor-totals/
class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        res = []  
        subset = []
        def dfs(i):
            if i >= len(nums):
                r = 0
                for i in subset:
                    r ^= i
                res.append(r)
                return
            # decision to include nums[i]
            subset.append(nums[i])
            dfs(i + 1)
            
            # decision not to include nums[i]
            subset.pop()
            dfs(i + 1)
            
        dfs(0)
        resSum = 0
        for num in res:
            resSum += num
        return resSum
