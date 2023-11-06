package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-03 17:33:27
 * @link https://leetcode.com/problems/unique-paths-ii/
 */
public class T63UniquePathsIi {

    public static void main(String[] args) {
        Solution solution = new T63UniquePathsIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePathsWithObstaclesV1(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0 || obstacleGrid[0][0] == 1) return 0;
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n]; dp[0][0] = 1;
        for (int i = 1; i < m; ++i) dp[i][0] = (dp[i-1][0] == 1 && obstacleGrid[i][0] != 1) ? 1 : 0;
        for (int j = 1; j < n; ++j) dp[0][j] = (dp[0][j-1] == 1 && obstacleGrid[0][j] != 1) ? 1 : 0;
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0 || obstacleGrid[0][0] == 1) return 0;
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] dp = new int[n]; dp[0] = 1;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                } else if (j > 0) {
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}