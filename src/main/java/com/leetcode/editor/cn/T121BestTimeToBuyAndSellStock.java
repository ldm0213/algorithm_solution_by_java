package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-05 11:31:42
 * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class T121BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        Solution solution = new T121BestTimeToBuyAndSellStock().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int minNum = prices[0], result = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; ++i) {
            minNum = Math.min(minNum, prices[i]);
            result = Math.max(result, prices[i] - minNum);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}