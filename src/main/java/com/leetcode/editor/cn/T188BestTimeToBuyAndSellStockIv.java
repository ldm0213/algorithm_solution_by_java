package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 19:20:46
 * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
 */
public class T188BestTimeToBuyAndSellStockIv {

    public static void main(String[] args) {
        Solution solution = new T188BestTimeToBuyAndSellStockIv().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfitNoLimit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; ++i) {
            result += Math.max(prices[i] - prices[i-1], 0);
        }
        return result;
    }
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (k > n / 2) return maxProfitNoLimit(prices);

        // 第k次交易表示买入或者卖出
        // dp[i][k][0]: 第i天交易k次后手头没有股票
        // dp[i][k][1]: 第i天交易k次后手头有股票
        int[][][] dp = new int[n][k+1][2];
        // 对于第一天该如何操作，买入或者休息
        for (int i = 1; i < k+1; ++i) {
            // 休息
            dp[0][i][0] = 0;
            // 买入
            dp[0][i][1] = -prices[0];
        }

        for (int i = 1; i < n; ++i) {
            for (int j = 1; j < k+1; ++j) {
                // dp[i][k][0]: 第i天交易k次后手头没有股票，手头没有股票 可以选择两种操作
                // 第i天可以选择休息: dp[i-1][k][0]
                // 第i天可以选择进行第k次交易的卖出股票: dp[i-1][j][1] + prices[i]（卖出后收益了prices[i]）
                dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
                // dp[i][k][1]: 第i天交易k次后手头有股票，手头有股票 可以选择两种操作
                // 第i天可以选择休息: dp[i-1][k][1]
                // 第i天可以选择进行第k次交易的买入股票: dp[i-1][j-1][1](再第k-1的交易的基础上) + prices[i]（买入耗费了prices[i]）
                dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][0] - prices[i]);
            }
        }
        // 最后手头交易了2次后手头无股票
        return dp[n-1][k][0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}