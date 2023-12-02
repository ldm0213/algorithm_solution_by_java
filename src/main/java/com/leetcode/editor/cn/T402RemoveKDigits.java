package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-28 13:54:01
 * @link https://leetcode.com/problems/remove-k-digits/
 */
public class T402RemoveKDigits {

    public static void main(String[] args) {
        Solution solution = new T402RemoveKDigits().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < num.length(); ++i) {
            // 尽可能删除高位上面大的数字
            while (k > 0 && !stk.isEmpty() && stk.peekFirst() > num.charAt(i)) {
                stk.pop();
                k--;
            }
            // 首位为0不入栈
            if (stk.isEmpty() && num.charAt(i) == '0') continue;
            stk.push(num.charAt(i));
        }
        // 可能是从低到高的顺序，没删够数字，再删一次
        while (!stk.isEmpty() && k > 0) {stk.pop(); k--;}
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.insert(0, stk.pop());
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}