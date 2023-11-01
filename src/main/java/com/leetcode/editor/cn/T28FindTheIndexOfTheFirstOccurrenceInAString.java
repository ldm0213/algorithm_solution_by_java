package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 19:53:13
 * @link https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class T28FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
        Solution solution = new T28FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); ++i) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                int p = i, q = 0;
                while (q < needle.length() && haystack.charAt(p) == needle.charAt(q)) {
                    ++p;
                    ++q;
                }
                if (q == needle.length()) return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}