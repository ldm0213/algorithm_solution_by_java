package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-12-01 14:04:31
 * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 */
public class T714BestTimeToBuyAndSellStockWithTransactionFee {

    public static void main(String[] args) {
        Solution solution = new T714BestTimeToBuyAndSellStockWithTransactionFee().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        // profit0: 手中无股票时候的最大收益
        // profit1: 手中有股票时候最大收益
        // 在卖出时候结算交易费用
        int profit0 = 0, profit1 = -prices[0] - fee;
        for (int i = 1; i < n; ++i) {
            // 当前位置上手中无股票可以选择
            // 1. 卖出股票: profit1 + prices[i];
            // 2. 不做任何操作: profit0
            int nextProfit0 = Math.max(profit0, profit1 + prices[i]);
            // 当前位置上手中有股票可以选择
            // 1. 买入股票: profit0 - prices[i] - fee;
            // 2. 不做任何操作: profit1
            int nextProfit1 = Math.max(profit1, profit0 - prices[i] - fee);
            profit0 = nextProfit0;
            profit1 = nextProfit1;
        }
        return profit0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}