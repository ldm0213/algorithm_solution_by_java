package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-06 17:36:02
 * @link https://leetcode.com/problems/valid-parentheses/
 */
public class T20ValidParentheses {

    public static void main(String[] args) {
        Solution solution = new T20ValidParentheses().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else {
                if (stk.isEmpty()) return false;
                char t = stk.pop();
                if ((ch == ')' && t != '(')
                        || (ch == ']' && t != '[')
                        || (ch == '}' && t != '{'))
                    return false;
            }
        }
        return stk.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}