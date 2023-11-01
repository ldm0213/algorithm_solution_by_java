package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 21:04:50
 * @link https://leetcode.com/problems/reverse-words-in-a-string/
 */
public class T151ReverseWordsInAString {

    public static void main(String[] args) {
        Solution solution = new T151ReverseWordsInAString().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') --i;
            j = i;
            while (i >= 0 && s.charAt(i) != ' ') --i;
            sb.append(s.substring(i+1, j+1)).append(" ");
        }
        return sb.toString().trim();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}