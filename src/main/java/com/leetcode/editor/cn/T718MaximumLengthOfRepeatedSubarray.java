package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-27 14:56:42
 * @link https://leetcode.com/problems/maximum-length-of-repeated-subarray/
 */
public class T718MaximumLengthOfRepeatedSubarray {

    public static void main(String[] args) {
        Solution solution = new T718MaximumLengthOfRepeatedSubarray().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        // dp[i][j] 表示数组A的前i个数字和数组B的前j个数字在尾部匹配的最长子数组的长度，
        // 如果 dp[i][j] 不为0，则A中第i个数组和B中第j个数字必须相等，且 dp[i][j] 的值就是往前推分别相等的个数
        int m = nums1.length, n = nums2.length, result = 0;
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (nums1[i-1] == nums2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                result = Math.max(result, dp[i][j]);
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}