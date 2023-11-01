package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-01 11:42:38
 * @link https://leetcode.com/problems/move-zeroes/
 */
public class T283MoveZeroes {

    public static void main(String[] args) {
        Solution solution = new T283MoveZeroes().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length, index = 0;
        for (int i = 0; i < len; ++i) {
            if (nums[i] != 0) nums[index++] = nums[i];
        }
        for (int i = index; i < len; ++i) nums[i] = 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}