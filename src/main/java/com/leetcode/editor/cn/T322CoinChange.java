package com.leetcode.editor.cn;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-27 14:42:25
 * @link https://leetcode.com/problems/coin-change/
 */
public class T322CoinChange {

    public static void main(String[] args) {
        Solution solution = new T322CoinChange().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin: coins) {
            for (int i = coin; i <= amount; ++i) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}