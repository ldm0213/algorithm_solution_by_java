package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-06 14:57:28
 * @link https://leetcode.com/problems/distinct-subsequences/
 */
public class T115DistinctSubsequences {

    public static void main(String[] args) {
        Solution solution = new T115DistinctSubsequences().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numDistinct(String s, String t) {
        if (s.length() < t.length()) return 0;
        int len1 = s.length(), len2 = t.length();
        // dp(i, j) 表示(0...i)的s能组成(0...j)的t个数
        int[][] dp = new int[len1+1][len2+1];
        for (int i = 0; i <= len1; ++i) {
            for (int j = 0; j <= len2; ++j) {
                if (j == 0) dp[i][j] = 1;
                else if (i == 0) dp[i][j] = 0;

                if (i > 0 && j > 0) {
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        // 如果相等，可以选择使用s的第i-1位置dp[i-1][j-1]
                        // 也可以选择不使用s的第i-1位置dp[i-1][j]
                        dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        return dp[len1][len2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}