package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-02 15:47:19
 * @link https://leetcode.com/problems/palindrome-partitioning/
 */
public class T131PalindromePartitioning {

    public static void main(String[] args) {
        Solution solution = new T131PalindromePartitioning().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    boolean isParlindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {--r; ++l;}
        return l >= r;
    }

    void backtrack(List<List<String>> result, List<String> current, String s, int pos) {
        if (pos == s.length()) {
            result.add(new ArrayList<>(current));
        }
        for (int i = pos; i < s.length(); ++i) {
            String t = s.substring(pos, i+1);
            if (isParlindrome(t)) {
                current.add(t);
                backtrack(result, current, s, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    public List<List<String>> partitionV1(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        backtrack(result, current, s, 0);
        return result;
    }

    void backtrackV2(List<List<String>> result, List<String> current, String s, int pos, boolean[][] dp) {
        if (pos == s.length()) {
            result.add(new ArrayList<>(current));
        }
        for (int i = pos; i < s.length(); ++i) {
            String t = s.substring(pos, i+1);
            if (dp[pos][i]) {
                current.add(t);
                backtrack(result, current, s, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i; j >= 0; --j) {
                if ((i - j < 2 || dp[j+1][i-1]) && s.charAt(i) == s.charAt(j))
                    dp[j][i] = true;
            }
        }
        backtrackV2(result, current, s, 0, dp);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}