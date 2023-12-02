package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-06 17:32:53
 * @link https://leetcode.com/problems/palindrome-number/
 */
public class T9PalindromeNumber {

    public static void main(String[] args) {
        Solution solution = new T9PalindromeNumber().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int y = 0;
        while (x > y) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return x == y || x == y/10;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}