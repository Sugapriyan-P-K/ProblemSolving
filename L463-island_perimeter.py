# https://leetcode.com/problems/island-perimeter/

class Solution:
    def getAside(self, grid: List[List[int]], row: int, col: int, ROW: int, COL: int) -> int:
        count = 0
        if (row - 1 >= 0):
            count = count + 1 if grid[row - 1][col] else count
        if (col + 1 < COL):
            count = count + 1 if grid[row][col + 1] else count
        if (row + 1 < ROW):
            count = count + 1 if grid[row + 1][col] else count
        if (col - 1 >= 0):
            count = count + 1 if grid[row][col - 1] else count
        return count
        
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        ROW, COL = len(grid), len(grid[0])
        res = 0
        for row in range(ROW):
            for col in range(COL):
                if (grid[row][col]):
                    res += 4
                    res -= self.getAside(grid, row, col, ROW, COL)
        return res
