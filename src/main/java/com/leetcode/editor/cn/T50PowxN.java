package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 10:37:18
 * @link https://leetcode.com/problems/powx-n/
 */
public class T50PowxN {

    public static void main(String[] args) {
        Solution solution = new T50PowxN().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    double helper(double x, long n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;
        double y = helper(x, n / 2);
        return y * y * (n % 2 == 1 ? x : 1.0);
    }
    public double myPow(double x, int n) {
        if (n < 0) return 1.0 / helper(x, Math.abs((long)n));
        else return helper(x, (long)n);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}