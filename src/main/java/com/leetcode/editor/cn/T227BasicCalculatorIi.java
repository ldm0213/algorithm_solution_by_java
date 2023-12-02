package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-20 21:11:24
 * @link https://leetcode.com/problems/basic-calculator-ii/
 */
public class T227BasicCalculatorIi {

    public static void main(String[] args) {
        Solution solution = new T227BasicCalculatorIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calculate(String s) {
        Deque<Integer> stk = new ArrayDeque<>();
        int index = 0, len = s.length();
        char pre = '+';
        while (index < len) {
            char ch = s.charAt(index);
            if (ch == ' ') {
                ++index;
            } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                pre = ch;
                ++index;
            } else if (ch >= '0' && ch <= '9') {
                int num = 0;
                while (index < len && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                    num = num * 10 + (s.charAt(index++) - '0');
                }
                if (pre == '/' || pre == '*') {
                    int t = stk.pop();
                    num = pre == '/' ? t / num : num * t;
                    stk.push(num);
                } else {
                    stk.push(num * (pre == '-' ? -1 : 1));
                }
            }
        }
        int result = 0;
        while (!stk.isEmpty()) result += stk.pop();
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}