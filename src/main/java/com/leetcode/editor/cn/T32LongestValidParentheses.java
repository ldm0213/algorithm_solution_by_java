package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-03 17:05:58
 * @link https://leetcode.com/problems/longest-valid-parentheses/
 */
public class T32LongestValidParentheses {

    public static void main(String[] args) {
        Solution solution = new T32LongestValidParentheses().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != ')') continue;
            for (int j = i - 1; j >= 0; --j) {
                // ()
                // (...()) i - dp[i-1] - 1
                // ()(...())
                if (i - j == 1 && s.charAt(j) == '(') {
                    dp[i] = 2 + (i - 2 >= 0 ? dp[i - 2] : 0);
                } else if (i - dp[i-1] > 0 && s.charAt(i - dp[i-1] - 1) == '(') {
                    dp[i] = 2 + dp[i-1] + ((i - dp[i-1] - 2 >= 0) ? dp[i - dp[i-1] - 2] : 0);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}