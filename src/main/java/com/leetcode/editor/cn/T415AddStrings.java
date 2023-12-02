package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-27 14:47:37
 * @link https://leetcode.com/problems/add-strings/
 */
public class T415AddStrings {

    public static void main(String[] args) {
        Solution solution = new T415AddStrings().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int p = num1.length() - 1, q = num2.length() - 1;
        int carry = 0;
        while (carry > 0 || p >= 0 || q >= 0) {
            int sum = carry;
            if (p >= 0) sum += (num1.charAt(p--) - '0');
            if (q >= 0) sum += (num2.charAt(q--) - '0');
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}