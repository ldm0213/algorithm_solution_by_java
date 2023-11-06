package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-05 10:04:06
 * @link https://leetcode.com/problems/jump-game-ii/
 */
public class T45JumpGameIi {

    public static void main(String[] args) {
        Solution solution = new T45JumpGameIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jump(int[] nums) {
        // lastEnd上一次跳跃到达的最远距离
        // currentMax当前能跳跃的最大距离
        int maxJump = 0, n = nums.length, currentMax = 0, lastEnd = 0;
        for (int i = 0; i < n - 1; ++i) {
            currentMax = Math.max(currentMax, i + nums[i]);
            // 上一次跳跃能到达的最远距离,if条件成立说明需要再次跳
            if (i == lastEnd) {
                maxJump += 1;
                lastEnd = currentMax;
                if (lastEnd >= n - 1) break;
            }
        }
        return maxJump;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}