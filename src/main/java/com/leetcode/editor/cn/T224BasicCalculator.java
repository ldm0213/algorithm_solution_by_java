package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-20 20:46:27
 * @link https://leetcode.com/problems/basic-calculator/
 */
public class T224BasicCalculator {

    public static void main(String[] args) {
        Solution solution = new T224BasicCalculator().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calculate(String s) {
        int len = s.length(), index = 0, sign = 1, result = 0;
        while (index < len) {
            if (s.charAt(index) == '(') {
                // 找到(对应的)
                int start = index, cnt = 0;
                for (; index < len; ++index) {
                    if (s.charAt(index) == '(') ++cnt;
                    if (s.charAt(index) == ')') --cnt;
                    if (cnt == 0) break;
                }
                result += sign * calculate(s.substring(start+1, index));
                index++;
            } else if (s.charAt(index) == ' ') {
                ++index;
            } else if (s.charAt(index) == '+' || s.charAt(index) == '-') {
                sign = s.charAt(index++) == '+' ? 1 : -1;
            } else {
                int t = 0;
                while (index < len && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                    t = t * 10 + (s.charAt(index++) - '0');
                }
                result += sign * t;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}