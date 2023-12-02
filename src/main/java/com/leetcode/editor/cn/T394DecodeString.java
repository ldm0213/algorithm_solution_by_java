package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-22 10:55:02
 * @link https://leetcode.com/problems/decode-string/
 */
public class T394DecodeString {

    public static void main(String[] args) {
        Solution solution = new T394DecodeString().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num = num * 10 + (s.charAt(i++) - '0');
            } else if (s.charAt(i) == '[') {
                int cnt1 = 0, cnt2 = 0, start = i;
                while (i < s.length()) {
                    if (s.charAt(i) == '[') ++cnt1;
                    if (s.charAt(i) == ']') ++cnt2;
                    if (cnt1 == cnt2) break;
                    i++;
                }
                String t = decodeString(s.substring(start + 1, i++));
                for (int m = 0; m < num; ++m) sb.append(t);
                num = 0;
            } else {
                sb.append(s.charAt(i++));
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}