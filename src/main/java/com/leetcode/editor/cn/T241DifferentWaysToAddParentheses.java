package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-06 16:09:13
 * @link https://leetcode.com/problems/different-ways-to-add-parentheses/
 */
public class T241DifferentWaysToAddParentheses {

    public static void main(String[] args) {
        Solution solution = new T241DifferentWaysToAddParentheses().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    Map<String, List<Integer>> mmap = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if (expression.isEmpty()) return new ArrayList<>(0);
        if (mmap.containsKey(expression)) return mmap.get(expression);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); ++i) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int p = 0; p < left.size(); ++p) {
                    for (int q = 0; q < right.size(); ++q) {
                        if (ch == '+') result.add(left.get(p) + right.get(q));
                        else if (ch == '-') result.add(left.get(p) - right.get(q));
                        else result.add(left.get(p) * right.get(q));
                    }
                }
            }
        }
        if (result.isEmpty()) result.add(Integer.valueOf(expression));
        mmap.put(expression, result);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}