package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-01 19:13:06
 * @link https://leetcode.com/problems/generate-parentheses/
 */
public class T22GenerateParentheses {

    public static void main(String[] args) {
        Solution solution = new T22GenerateParentheses().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<String> result = new ArrayList<>();
    void dfs(int l, int r, String current) {
        if (l == 0 && r == 0) {
            result.add(current);
        } else {
            if (l > 0) dfs(l - 1, r, current + "(");
            if (l < r) dfs(l, r - 1, current + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}