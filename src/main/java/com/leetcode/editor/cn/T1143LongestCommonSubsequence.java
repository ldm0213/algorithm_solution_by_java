package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-27 14:50:27
 * @link https://leetcode.com/problems/longest-common-subsequence/
 */
public class T1143LongestCommonSubsequence {

    public static void main(String[] args) {
        Solution solution = new T1143LongestCommonSubsequence().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}