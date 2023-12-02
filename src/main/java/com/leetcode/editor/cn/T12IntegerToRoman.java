package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 09:55:07
 * @link https://leetcode.com/problems/integer-to-roman/
 */
public class T12IntegerToRoman {

    public static void main(String[] args) {
        Solution solution = new T12IntegerToRoman().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C",
                "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanNum = {1000, 900, 500, 400, 100,
                90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < romanNum.length; ++i) {
            while (num >= romanNum[i]) {
                sb.append(roman[i]);
                num -= romanNum[i];
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}