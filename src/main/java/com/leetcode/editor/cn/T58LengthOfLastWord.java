package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 11:04:29
 * @link https://leetcode.com/problems/length-of-last-word/
 */
public class T58LengthOfLastWord {

    public static void main(String[] args) {
        Solution solution = new T58LengthOfLastWord().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        int right = 0, left = 0, index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') --index;
        right = index;
        while (index >= 0 && s.charAt(index) != ' ') --index;
        return right - index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}