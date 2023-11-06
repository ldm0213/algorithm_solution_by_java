package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-05 10:55:10
 * @link https://leetcode.com/problems/interleaving-string/
 */
public class T97InterleavingString {

    public static void main(String[] args) {
        Solution solution = new T97InterleavingString().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        int m = s1.length(), n = s2.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int i = 1; i <= m; ++i) if (s1.charAt(i-1) == s3.charAt(i-1) && dp[i-1][0]) dp[i][0] = true;
        for (int j = 1; j <= n; ++j) if (s2.charAt(j-1) == s3.charAt(j-1) && dp[0][j-1]) dp[0][j] = true;
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                boolean useS1 = s1.charAt(i-1) == s3.charAt(i+j-1) && dp[i-1][j];
                boolean useS2 = s2.charAt(j-1) == s3.charAt(i+j-1) && dp[i][j-1];
                if (useS1 || useS2) dp[i][j] = true;
            }
        }
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}