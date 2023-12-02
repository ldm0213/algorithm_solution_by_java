package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-20 20:37:30
 * @link https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */
public class T150EvaluateReversePolishNotation {

    public static void main(String[] args) {
        Solution solution = new T150EvaluateReversePolishNotation().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; ++i) {
            String str = tokens[i];
            if (str.equals("/") || str.equals("+") || str.equals("*") || str.equals("-")) {
                Integer second = stk.pop();
                Integer first = stk.pop();
                Integer num = 0;
                if (str.equals("-")) num = first - second;
                else if (str.equals("*")) num = first * second;
                else if (str.equals("/")) num = first / second;
                else num = first + second;
                stk.push(num);
            } else {
                stk.push(Integer.valueOf(str));
            }
        }
        return stk.pop();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}