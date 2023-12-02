package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-08 19:59:26
 * @link https://leetcode.com/problems/single-number-ii/
 */
public class T137SingleNumberIi {

    public static void main(String[] args) {
        Solution solution = new T137SingleNumberIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            int sum = 0;
            for (int num: nums) {
                if (((1 << i) & num) != 0) {
                    sum += 1;
                }
            }
            if (sum % 3 != 0) result += (1 << i);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}