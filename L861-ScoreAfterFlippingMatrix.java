// https://leetcode.com/problems/score-after-flipping-matrix/
class Solution {
    public int matrixScore(int[][] grid) {
        int ROW = grid.length, COL = grid[0].length, half = ROW / 2;
        int res = (1 << (COL - 1)) * ROW;
        for (int row = 0; row < ROW; row++) {
            if (grid[row][0] == 0) {
                for (int col = 0; col < COL; col++) {
                    grid[row][col] ^= 1;
                }
            }
        }
        for (int col = 1; col < COL; col++) {
            int zeroCount = 0, curScore = 0;
            for (int row = 0; row < ROW; row++) {
                if (grid[row][col] == 0) {
                    zeroCount += 1;
                } else {
                    curScore += (1 << (COL - col - 1));
                }
            }
            if (zeroCount > half) {
                for (int row = 0; row < ROW; row++) {
                    grid[row][col] ^= 1;
                    res += (grid[row][col] << (COL - col - 1));
                }
            } else {
                res += curScore;
            }
        }
        return res;
    }
}
