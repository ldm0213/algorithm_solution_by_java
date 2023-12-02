package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 14:19:01
 * @link https://leetcode.com/problems/count-and-say/
 */
public class T38CountAndSay {

    public static void main(String[] args) {
        Solution solution = new T38CountAndSay().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = "1";
        for (int i = 2; i <= n; ++i) {
            int j = 0, len = prev.length();
            StringBuilder sb = new StringBuilder();
            while (j < len) {
                int index = j;
                char ch = prev.charAt(j++);
                while (j < len && prev.charAt(j) == ch) ++j;
                int charLength = j - index;
                sb.append(charLength).append(ch);
            }
            prev = sb.toString();
        }
        return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}