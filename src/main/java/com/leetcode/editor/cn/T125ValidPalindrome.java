package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 21:00:31
 * @link https://leetcode.com/problems/valid-palindrome/
 */
public class T125ValidPalindrome {

    public static void main(String[] args) {
        Solution solution = new T125ValidPalindrome().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) ++l;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) --r;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            ++l;
            --r;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}