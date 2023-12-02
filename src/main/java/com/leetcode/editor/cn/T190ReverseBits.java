package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 19:11:06
 * @link https://leetcode.com/problems/reverse-bits/
 */
public class T190ReverseBits {

    public static void main(String[] args) {
        Solution solution = new T190ReverseBits().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}