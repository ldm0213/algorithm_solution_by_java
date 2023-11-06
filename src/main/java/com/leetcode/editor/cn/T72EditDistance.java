package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-05 09:52:52
 * @link https://leetcode.com/problems/edit-distance/
 */
public class T72EditDistance {

    public static void main(String[] args) {
        Solution solution = new T72EditDistance().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; ++i) dp[i][0] = i;
        for (int j = 0; j <= n; ++j) dp[0][j] = j;
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // dp[i][j] 表示第(0..i), (0...j)的两个word最小变换距离
                    // 对word1的第i的字符的操作
                    // 增，dp[i][j] = dp[i][j - 1] + 1
                    // 删，dp[i][j] = dp[i - 1][j] + 1
                    // 改，dp[i][j] = dp[i - 1][j - 1] + 1
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]),
                            dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}