package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-06 15:42:39
 * @link https://leetcode.com/problems/palindrome-partitioning-ii/
 */
public class T132PalindromePartitioningIi {

    public static void main(String[] args) {
        Solution solution = new T132PalindromePartitioningIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCut(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i; j >= 0; --j) {
                if ((i - j < 2 || dp[j+1][i-1]) && s.charAt(i) == s.charAt(j))
                    dp[j][i] = true;
            }
        }

        int[] f = new int[s.length()];
        Arrays.fill(f, Integer.MAX_VALUE);
        for (int i = 0; i < s.length(); ++i) {
            if (dp[0][i]) {
                f[i] = 0;
            } else {
                for (int j = 0; j < i; ++j) {
                    if (dp[j+1][i]) {
                        f[i] = Math.min(f[j] + 1, f[i]);
                    }
                }
            }
        }
        return f[s.length() - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}