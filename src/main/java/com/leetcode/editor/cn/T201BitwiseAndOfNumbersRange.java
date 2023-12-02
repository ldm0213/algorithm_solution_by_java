package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 17:55:07
 * @link https://leetcode.com/problems/bitwise-and-of-numbers-range/
 */
public class T201BitwiseAndOfNumbersRange {

    public static void main(String[] args) {
        Solution solution = new T201BitwiseAndOfNumbersRange().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int i = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            ++i;
        }
        return (left << i);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}