package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 11:22:58
 * @link https://leetcode.com/problems/add-binary/
 */
public class T67AddBinary {

    public static void main(String[] args) {
        Solution solution = new T67AddBinary().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int p = a.length() - 1, q = b.length() - 1, carry = 0;
        while (p >= 0 || q >= 0 || carry > 0) {
            int sum = carry;
            if (p >= 0)  sum += (a.charAt(p--) - '0');
            if (q >= 0) sum += (b.charAt(q--) - '0');
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}