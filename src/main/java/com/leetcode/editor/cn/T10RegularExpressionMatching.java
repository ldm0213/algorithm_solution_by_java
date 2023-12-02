package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-22 20:33:42
 * @link https://leetcode.com/problems/regular-expression-matching/
 */
public class T10RegularExpressionMatching {

    public static void main(String[] args) {
        Solution solution = new T10RegularExpressionMatching().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    boolean helper(String s, String p, int pos1, int pos2) {
        if (pos1 == 0) return false;
        if (p.charAt(pos2 - 1) == '.') return true;
        return s.charAt(pos1 - 1) == p.charAt(pos2 - 1);
    }
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        // s[0,i) 和 p[0,j) 是否 match
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (j > 1 && p.charAt(j-1) == '*') {
                    // 0个dp[i][j-2]
                    // 1个或者多个
                    dp[i][j] = dp[i][j-2] || (i > 0 && (p.charAt(j-2) == '.' || p.charAt(j-2) == s.charAt(i-1)) && dp[i-1][j]);
                } else {
                    dp[i][j] = i > 0 && (p.charAt(j-1) == '.' || p.charAt(j-1) == s.charAt(i-1)) && dp[i-1][j-1];
                }
            }
        }
        return dp[m][n];
    }

    public boolean isMatchV1(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        // 是*时候，0个或者多个前一个字符
        if (p.length() > 1 && p.charAt(1) == '*') {
            return
               // 0个前一个字符
               isMatch(s, p.substring(2)) ||
               // 1个或者多个前一个字符
                 (!s.isEmpty()
                   && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')
                   && isMatch(s.substring(1), p)
                );
        } else {
            return !s.isEmpty()
              && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')
              && isMatch(s.substring(1), p.substring(1));
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}