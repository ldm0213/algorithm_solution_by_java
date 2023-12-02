package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-28 10:15:28
 * @link https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
 */
public class T329LongestIncreasingPathInAMatrix {

    public static void main(String[] args) {
        Solution solution = new T329LongestIncreasingPathInAMatrix().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int dfs(int[][] matrix, int[][] memo, int x, int y, int m, int n) {
        if (memo[x][y] != 0) return memo[x][y];
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int current = 1;
        for (int i = 0; i < dirs.length; ++i) {
            int xx = dirs[i][0] + x;
            int yy = dirs[i][1] + y;
            if (xx < 0 || xx >= m || yy < 0 || yy >= n) continue;
            if (matrix[xx][yy] <= matrix[x][y]) continue;
            current = Math.max(current, dfs(matrix, memo, xx, yy, m, n) + 1);
        }
        memo[x][y] = current;
        return memo[x][y];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, result = 0;
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                result = Math.max(result, dfs(matrix, memo, i, j, m, n));
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}