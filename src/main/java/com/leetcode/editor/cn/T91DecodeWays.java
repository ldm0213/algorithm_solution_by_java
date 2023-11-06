package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-05 11:08:46
 * @link https://leetcode.com/problems/decode-ways/
 */
public class T91DecodeWays {

    public static void main(String[] args) {
        Solution solution = new T91DecodeWays().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i <= s.length(); ++i) {
            if (s.charAt(i-1) != '0') {
                dp[i] += dp[i-1];
            }
            if (i > 1 && s.charAt(i - 2) != '0'
                    && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}