package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-30 19:14:07
 * @link https://leetcode.com/problems/shortest-palindrome/
 */
public class T214ShortestPalindrome {

    public static void main(String[] args) {
        Solution solution = new T214ShortestPalindrome().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String shortestPalindrome(String s) {
        // s' + s = 回文  =>  最后几个字符逆序R(s1) + 中间字符s2 + 最后几个字符s1
        // 找到s1 [肯定不属于回文前缀]
        int n = s.length(), i = 0;
        for (int j = n - 1; j >= 0; --j) {
            if (s.charAt(i) == s.charAt(j)) ++i;
        }
        if (i == n) return s;
        String s1 = s.substring(i);
        String rs1 = (new StringBuilder(s1)).reverse().toString();
        return rs1 + shortestPalindrome(s.substring(0, i)) + s1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}