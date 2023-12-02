package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-12-01 11:43:22
 * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class T309BestTimeToBuyAndSellStockWithCooldown {

    public static void main(String[] args) {
        Solution solution = new T309BestTimeToBuyAndSellStockWithCooldown().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // 当前手中没有股票收益profit0。有股票最大收益profit1
        int profit0 = 0, profit1 = -prices[0];
        // 前天手中没股票的收益preProfit0
        int preProfit0 = 0;
        for (int i = 1; i < n; ++i) {
            // 第i个位置，如果手中无股票，可以选择:
            // 不操作: 第i-1个位置手中无股票
            // 卖出: 第i-1位置手中有股票+卖出当前位置股票
            int nextProfit0 = Math.max(profit0, profit1 + prices[i]);
            // 第i个位置，如果手中有股票，可以选择
            // 不操作: 第i-1个位置手中有股票
            // 卖入: 第i-2位置手中有股票+卖出当前位置股票
             int nextProfit1 = Math.max(profit1, preProfit0 - prices[i]);

             preProfit0 = profit0;
             profit0 = nextProfit0;
             profit1 = nextProfit1;
        }
        return profit0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}