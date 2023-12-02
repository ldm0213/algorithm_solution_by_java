package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-27 20:51:46
 * @link https://leetcode.com/problems/integer-break/
 */
public class T343IntegerBreak {

    public static void main(String[] args) {
        Solution solution = new T343IntegerBreak().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j < i; ++j) {
                // 将 i 拆分成 j 和 i−j 的和，且 i−j 不再拆分成多个正整数，此时的乘积是 j×(i−j)；
                // 将 i 拆分成 j 和 i−j 的和，且 i−j 继续拆分成多个正整数，此时的乘积是 j×dp[i−j]。
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], (i - j) * j));
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}