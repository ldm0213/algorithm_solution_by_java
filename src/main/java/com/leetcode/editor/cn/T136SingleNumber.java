package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-08 19:58:20
 * @link https://leetcode.com/problems/single-number/
 */
public class T136SingleNumber {

    public static void main(String[] args) {
        Solution solution = new T136SingleNumber().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; ++i) {
            num ^= nums[i];
        }
        return num;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}