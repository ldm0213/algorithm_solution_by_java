package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-03 17:26:57
 * @link https://leetcode.com/problems/unique-paths/
 */
public class T62UniquePaths {

    public static void main(String[] args) {
        Solution solution = new T62UniquePaths().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePathsV1(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i) dp[i][0] = 1;
        for (int j = 0; j < n; ++j) dp[0][j] = 1;
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        // 全部赋值1表示只有一行每个位置都只有一种走的可能性
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[j] += dp[j-1];
            }
        }
        return dp[n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}