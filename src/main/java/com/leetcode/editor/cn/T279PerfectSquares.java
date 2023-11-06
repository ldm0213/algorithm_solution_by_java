package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-03 16:35:51
 * @link https://leetcode.com/problems/perfect-squares/
 */
public class T279PerfectSquares {

    public static void main(String[] args) {
        Solution solution = new T279PerfectSquares().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                // i - j * j  数组k是由k - j * j所需要的最小平方和加上j这个平方数
                minn = Math.min(minn, dp[i - j * j]);
            }
            dp[i] = minn + 1;
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}