package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-30 17:25:22
 * @link https://leetcode.com/problems/wildcard-matching/
 */
public class T44WildcardMatching {

    public static void main(String[] args) {
        Solution solution = new T44WildcardMatching().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int i = 1; i <= n; ++i) dp[0][i] = dp[0][i-1] && (p.charAt(i-1) == '*');
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    // 若p中第j个字符是星号，由于星号可以匹配空串，所以如果p中的前 j-1 个字符跟s中前i个字符匹配成功了，即 dp[i][j-1]
                    // 若p中的前j个字符跟s中的前 i-1 个字符匹配成功了，因为星号可以匹配任意字符串，再多加一个任意字符也没问题
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                } else {
                    dp[i][j] = dp[i-1][j-1] &&
                            (p.charAt(j - 1) == '?' ||
                              p.charAt(j - 1) == s.charAt(i - 1));
                }
            }
        }
        return dp[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}