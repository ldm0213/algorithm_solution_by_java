package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 21:11:09
 * @link https://leetcode.com/problems/power-of-two/
 */
public class T231PowerOfTwo {

    public static void main(String[] args) {
        Solution solution = new T231PowerOfTwo().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}