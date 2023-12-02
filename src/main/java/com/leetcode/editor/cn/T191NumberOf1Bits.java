package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 19:23:03
 * @link https://leetcode.com/problems/number-of-1-bits/
 */
public class T191NumberOf1Bits {

    public static void main(String[] args) {
        Solution solution = new T191NumberOf1Bits().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            result += ((n & 1) == 0) ? 0 : 1;
            n = n >>> 1;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}