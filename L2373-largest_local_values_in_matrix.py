# https://leetcode.com/problems/largest-local-values-in-a-matrix/
class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        n = len(grid)
        res = []
        for i in range(n - 2):
            t = []
            for j in range(n - 2):
                maxi = 0
                for row in range(i, i + 3):
                    for col in range(j, j + 3):
                        maxi = max(maxi, grid[row][col])
                t.append(maxi)
            res.append(t)
        return res
