package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-21 16:24:29
 * @link https://leetcode.com/problems/fraction-to-recurring-decimal/
 */
public class T166FractionToRecurringDecimal {

    public static void main(String[] args) {
        Solution solution = new T166FractionToRecurringDecimal().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long a = numerator;  long b = denominator;
        boolean negative = a < 0 ^ b < 0;
        StringBuilder sb = new StringBuilder();
        a = Math.abs(a); b = Math.abs(b);
        long integerPart = a / b;
        long rem = a % b;

        if (negative && (integerPart > 0 || rem > 0)) sb.append("-");
        sb.append(a / b);
        if (rem == 0) return sb.toString();

        sb.append(".");
        int pos = sb.length();
        Map<Long, Integer> posMap = new HashMap<>();
        while (rem != 0) {
            if (posMap.containsKey(rem)) {
                sb.insert(posMap.get(rem), "(");
                sb.append(")");
                break;
            }
            posMap.put(rem, pos++);
            sb.append(rem * 10 / b);
            rem = rem * 10 % b;
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}