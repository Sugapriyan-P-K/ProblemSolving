# https://leetcode.com/problems/score-after-flipping-matrix/
class Solution:
    def matrixScore(self, grid: List[List[int]]) -> int:
        m = len(grid) # row
        n = len(grid[0]) # column
        res = (1 << (n - 1)) * m
        for row in range(m):
            if (grid[row][0] == 0):
                for col in range(n):
                    grid[row][col] ^= 1
        for col in range(1, n):
            zeroCount, curScore = 0, 0
            for row in range(m):
                if (grid[row][col] == 0):
                    zeroCount += 1
                else:
                    curScore += (1 << (n - col - 1))
            if (zeroCount > m // 2):
                for row in range(m):
                    grid[row][col] ^= 1
                    res += (grid[row][col] << (n - col - 1))
            else:
                res += curScore
        return res
