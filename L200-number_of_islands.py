# https://leetcode.com/problems/number-of-islands/

class Solution:
    def while_it_has_neighbors(self, grid, row, col, ROW, COL, is_visited):
        if (row < 0 or col < 0 or row == ROW or col == COL):
            return
        if (grid[row][col] == '0' or is_visited[row][col]):
            is_visited[row][col] = True
            return
        is_visited[row][col] = True
        self.while_it_has_neighbors(grid, row - 1, col, ROW, COL, is_visited)
        self.while_it_has_neighbors(grid, row, col + 1, ROW, COL, is_visited)
        self.while_it_has_neighbors(grid, row + 1, col, ROW, COL, is_visited)
        self.while_it_has_neighbors(grid, row, col - 1, ROW, COL, is_visited)
        return

    def numIslands(self, grid: List[List[str]]) -> int:
        ROW, COL = len(grid), len(grid[0])
        res = 0
        is_visited = [[False for _ in range(COL)] for _ in range(ROW)]
        for row in range(ROW):
            for col in range(COL):
                if (grid[row][col] == '0' or is_visited[row][col]):
                    is_visited[row][col] = True
                    continue
                else:
                    self.while_it_has_neighbors(grid, row, col, ROW, COL, is_visited)
                    res += 1
        return res
