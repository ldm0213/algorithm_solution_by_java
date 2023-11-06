package com.leetcode.editor.cn;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author  lidongmeng
 * @date 2023-11-05 11:35:14
 * @link https://leetcode.com/problems/word-break/
 */
public class T139WordBreak {

    public static void main(String[] args) {
        Solution solution = new T139WordBreak().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i; j >= 0; --j) {
                String t = s.substring(j, i+1);
                if ((j - 1 < 0 || dp[j-1]) && wordSet.contains(t)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length() - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}