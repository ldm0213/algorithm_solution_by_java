package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-06 17:34:05
 * @link https://leetcode.com/problems/longest-common-prefix/
 */
public class T14LongestCommonPrefix {

    public static void main(String[] args) {
        Solution solution = new T14LongestCommonPrefix().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    String helper(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int p = 0, q = 0, len1 = s1.length(), len2 = s2.length();
        while (p < len1 && q < len2 && s1.charAt(p) == s2.charAt(q)) {
            sb.append(s1.charAt(p));
            p++;
            q++;
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String result = strs[0];
        for (int i = 1; i < strs.length; ++i) {
            result = helper(result, strs[i]);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}