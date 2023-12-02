package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-06 16:49:22
 * @link https://leetcode.com/problems/string-to-integer-atoi/
 */
public class T8StringToIntegerAtoi {

    public static void main(String[] args) {
        Solution solution = new T8StringToIntegerAtoi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int myAtoi(String s) {
        int index = 0, len = s.length();
        while (index < len && s.charAt(index) == ' ') ++index;
        int flag = 1, result = 0;
        if (index < len && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            flag = s.charAt(index++) == '+' ? 1 : -1;
        }
        while (index < len) {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                int t = ch - '0';
                if (Integer.MAX_VALUE / 10 < result
                        || (Integer.MAX_VALUE / 10 == result && t > 7))
                    return flag == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                result = result * 10 + t;
                index++;
            } else {
                break;
            }
        }
        return result * flag;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}