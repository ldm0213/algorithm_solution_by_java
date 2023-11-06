package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-03 17:47:21
 * @link https://leetcode.com/problems/minimum-path-sum/
 */
public class T64MinimumPathSum {

    public static void main(String[] args) {
        Solution solution = new T64MinimumPathSum().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 1; i < m; ++i) grid[i][0] += grid[i-1][0];
        for (int j = 1; j < n; ++j) grid[0][j] += grid[0][j-1];
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}