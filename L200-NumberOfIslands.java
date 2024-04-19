// https://leetcode.com/problems/number-of-islands/
class Solution {
    public void itHasNeighbors(char[][] grid, int row, int col, int ROW, int COL, boolean[][] isVisited) {
        if (row < 0 || col < 0 || col == COL || row == ROW) {
            return;
        }
        if (grid[row][col] == '0' || isVisited[row][col]) {
            isVisited[row][col] = true;
            return;
        }
        isVisited[row][col] = true;
        itHasNeighbors(grid, row - 1, col, ROW, COL, isVisited);
        itHasNeighbors(grid, row, col + 1, ROW, COL, isVisited);
        itHasNeighbors(grid, row + 1, col, ROW, COL, isVisited);
        itHasNeighbors(grid, row, col - 1, ROW, COL, isVisited);
        return;
    }

    public int numIslands(char[][] grid) {
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        int ROW = grid.length, COL = grid[0].length, res = 0;
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                if (grid[row][col] == '0' || isVisited[row][col]) {
                    isVisited[row][col] = true;
                    continue;
                } else {
                    itHasNeighbors(grid, row, col, ROW, COL, isVisited);
                    res += 1;
                }
            }
        }
        return res;
    }
}
