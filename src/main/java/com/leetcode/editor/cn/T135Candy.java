package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-09 14:54:05
 * @link https://leetcode.com/problems/candy/
 */
public class T135Candy {

    public static void main(String[] args) {
        Solution solution = new T135Candy().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int i = 1; i < len; ++i) {
            if (ratings[i] > ratings[i - 1] && dp[i] <= dp[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        for (int i = len - 2; i >= 0; --i) {
            if (ratings[i] > ratings[i + 1] && dp[i] <= dp[i + 1]) {
                dp[i] = dp[i + 1] + 1;
            }
        }
        int result = 0;
        for (int i = 0; i < len; ++i) result += dp[i];
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}