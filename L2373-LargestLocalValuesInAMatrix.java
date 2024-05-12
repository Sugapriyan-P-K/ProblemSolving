// https://leetcode.com/problems/largest-local-values-in-a-matrix/
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int res[][] = new int[n - 2][n - 2], p1 = 0, p2 = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = 0;
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < 3 + j; col++) {
                        max = Math.max(max, grid[row][col]);
                    }
                }
                if (p2 == n - 2) {
                    p1 += 1;
                    p2 = 0;
                }
                res[p1][p2++] = max;
            }
        }
        return res;
    }
}
