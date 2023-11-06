package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-06 11:06:49
 * @link https://leetcode.com/problems/maximal-square/
 */
public class T221MaximalSquare {

    public static void main(String[] args) {
        Solution solution = new T221MaximalSquare().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximalSquare(char[][] matrix) {
         int m = matrix.length, n = matrix[0].length, result = 0;
         int[][] dp = new int[m][n];
         for (int i = 0; i < m; ++i) {
             for (int j = 0; j < n; ++j) {
                 if (j == 0 && matrix[i][j] == '1') dp[i][j] = 1;
                 if (i == 0 && matrix[i][j] == '1') dp[i][j] = 1;
                 if (i > 0 && j > 0 && matrix[i][j] == '1') {
                     dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                 }
                 result = Math.max(dp[i][j], result);
             }
         }
         return result * result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}