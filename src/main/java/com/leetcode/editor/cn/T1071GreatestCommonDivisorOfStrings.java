package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-27 21:04:39
 * @link https://leetcode.com/problems/greatest-common-divisor-of-strings/
 */
public class T1071GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
        Solution solution = new T1071GreatestCommonDivisorOfStrings().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int gcd(int a, int b) {
        int remainder = a % b;
        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
    }

    boolean check(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lenS / lenT; ++i) {
            sb.append(t);
        }
        return s.equals(sb.toString());
    }

    public String gcdOfStrings(String str1, String str2) {
         int len1 = str1.length(), len2 = str2.length();
         int gcdNum = gcd(len1, len2);
         String result = str1.substring(0, gcdNum);
         if (check(str1, result) && check(str2, result)) return result;
         else return "";
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}