package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-30 21:01:03
 * @link https://leetcode.com/problems/number-of-digit-one/
 */
public class T233NumberOfDigitOne {

    public static void main(String[] args) {
        Solution solution = new T233NumberOfDigitOne().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countDigitOne(int n) {
        // 计算每一位上是1的数字个数
        int res = 0;
        for (long k = 1; k <= n; k *= 10) {
            long r = n / k, m = n % k;
            // (x+8)/10 来判断一个数是否大于等于2
            res += (r + 8) / 10 * k + (r % 10 == 1 ? m + 1 : 0);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}