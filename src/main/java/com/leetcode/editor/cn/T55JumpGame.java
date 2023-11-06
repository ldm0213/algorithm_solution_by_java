package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-03 17:24:17
 * @link https://leetcode.com/problems/jump-game/
 */
public class T55JumpGame {

    public static void main(String[] args) {
        Solution solution = new T55JumpGame().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0, len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (max < i) return false;
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}