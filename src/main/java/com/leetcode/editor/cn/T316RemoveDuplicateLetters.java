package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-28 11:14:30
 * @link https://leetcode.com/problems/remove-duplicate-letters/
 */
public class T316RemoveDuplicateLetters {

    public static void main(String[] args) {
        Solution solution = new T316RemoveDuplicateLetters().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicateLetters(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        // 是否在栈中了
        boolean[] inStack = new boolean[256];
        // 字符在原字符串中一共有多少个
        int[] cnts = new int[256];
        for (Character ch: s.toCharArray()) {
            cnts[ch]++;
        }
        for (Character ch: s.toCharArray()) {
            cnts[ch]--;
            // 已经在栈中了不用再管这个字符
            if (inStack[ch]) continue;

            // 不在栈中，由于要进行字典序保障，需要判断栈顶元素是否比当前元素大
            while (!stk.isEmpty() && stk.peek() > ch) {
                // 必要约束，如果后面没有该字符了是不能出栈的
                if (cnts[stk.peek()] == 0) {
                    break;
                }
                inStack[stk.pop()] = false;
            }
            stk.push(ch);
            inStack[ch] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) sb.append(stk.pop());
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}