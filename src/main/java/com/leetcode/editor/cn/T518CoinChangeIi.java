package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-27 20:28:14
 * @link https://leetcode.com/problems/coin-change-ii/
 */
public class T518CoinChangeIi {

    public static void main(String[] args) {
        Solution solution = new T518CoinChangeIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}