package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-06 16:22:08
 * @link https://leetcode.com/problems/reverse-integer/
 */
public class T7ReverseInteger {

    public static void main(String[] args) {
        Solution solution = new T7ReverseInteger().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) return 0;
        boolean isNeg = x < 0;
        int xx = Math.abs(x);
        int y = 0;
        while (xx != 0) {
            int t = xx % 10;
            if (Integer.MAX_VALUE / 10 < y ||
                    (Integer.MAX_VALUE / 10 == y && t > 7)) return 0;
            y = y * 10 + t;
            xx = xx / 10;
        }
        return isNeg ? y * -1 : y;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}