package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 10:31:12
 * @link https://leetcode.com/problems/divide-two-integers/
 */
public class T29DivideTwoIntegers {

    public static void main(String[] args) {
        Solution solution = new T29DivideTwoIntegers().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int divide(int dividend, int divisor) {
        // m = n * 2 ^ x + n * 2 ^ (x - 1) + ... + n * 2 ^ 0
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (divisor == 1) return dividend;
        long m = Math.abs((long)dividend), n = Math.abs((long)divisor);
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        int result = 0;
        while (m >= n) {
            long t = n, p = 1;
            while (m >= (t << 1)) {
                // n * 2 ^ x
                t <<= 1;
                // 2 ^ x
                p <<= 1;
            }
            m -= t;
            result += p;
        }
        return sign * result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}