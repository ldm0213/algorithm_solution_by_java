package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 11:39:39
 * @link https://leetcode.com/problems/longest-increasing-subsequence/
 */
public class T300LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Solution solution = new T300LongestIncreasingSubsequence().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLISV1(int[] nums) {
        int[] dp = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; ++i) {
            dp[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public int lengthOfLISV1(int[] nums) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}