package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-03 16:51:04
 * @link https://leetcode.com/problems/longest-palindromic-substring/
 */
public class T5LongestPalindromicSubstring {

    public static void main(String[] args) {
        Solution solution = new T5LongestPalindromicSubstring().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindromeV1(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i; j >= 0; --j) {
                if ((i - j < 2 || dp[j+1][i-1]) && s.charAt(i) == s.charAt(j)) dp[j][i] = true;
            }
        }
        int maxLen = 0, start = -1;
        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0; j < s.length(); ++j) {
                if (dp[i][j] && (j - i + 1) > maxLen) {
                    maxLen = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    public String longestPalindrome(String s) {
        int len = s.length(), maxLen = 0, start = -1;
        for (int i = 0; i < len; ++i) {
            // i在中间，奇数个的palindrome
            int l = i, r = i;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {l--; r++;}
            if (r - l - 1 > maxLen) {
                maxLen = r - l -1;
                start = l + 1;
            }
            // i在左边,偶数个的palindrome
            l = i; r = i + 1;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {l--; r++;}
            if (r - l - 1 > maxLen) {
                maxLen = r - l -1;
                start = l + 1;
            }
        }
        return s.substring(start, start + maxLen);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}