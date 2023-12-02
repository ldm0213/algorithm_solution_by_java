package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-06 17:39:21
 * @link https://leetcode.com/problems/multiply-strings/
 */
public class T43MultiplyStrings {

    public static void main(String[] args) {
        Solution solution = new T43MultiplyStrings().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String multiply(String num1, String num2) {
        char[] num1Arr = new StringBuilder(num1).reverse().toString().toCharArray();
        char[] num2Arr = new StringBuilder(num2).reverse().toString().toCharArray();
        char[] result = new char[num1Arr.length + num2Arr.length];
        Arrays.fill(result, '0');
        for (int i = 0; i < num1Arr.length; ++i) {
            int carry = 0, j = 0;
            for (; j < num2Arr.length; ++j) {
                int sum = (result[i + j] - '0') + (num1Arr[i] - '0') * (num2Arr[j] - '0') + carry;
                result[i + j] = (char) ('0' + sum % 10);
                carry = sum / 10;
            }
            while (carry != 0) {
                int sum = (result[i + j] - '0') +  carry % 10;
                result[i + j] = (char) ('0' + sum % 10);
                carry = carry / 10;
                j++;
            }
        }
        StringBuilder sb = new StringBuilder();
        int index = result.length - 1;
        while (index >= 0 && result[index] == '0') --index;
        for (; index >= 0; --index) sb.append(result[index]);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}