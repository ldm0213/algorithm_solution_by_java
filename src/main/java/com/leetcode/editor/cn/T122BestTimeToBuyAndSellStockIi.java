package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-05 11:33:47
 * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class T122BestTimeToBuyAndSellStockIi {

    public static void main(String[] args) {
        Solution solution = new T122BestTimeToBuyAndSellStockIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; ++i) {
            result += Math.max(prices[i] - prices[i-1], 0);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}