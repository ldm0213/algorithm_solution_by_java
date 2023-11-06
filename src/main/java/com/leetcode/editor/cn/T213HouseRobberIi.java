package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-05 17:28:33
 * @link https://leetcode.com/problems/house-robber-ii/
 */
public class T213HouseRobberIi {

    public static void main(String[] args) {
        Solution solution = new T213HouseRobberIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int getMax(int[] nums, int l, int r) {
        int prev = 0, prevprev = 0;
        for (int i = l; i <= r; ++i) {
            int t = Math.max(prev, prevprev + nums[i]);
            prevprev = prev;
            prev = t;
        }
        return prev;
    }
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(getMax(nums, 0, nums.length - 2), getMax(nums, 1, nums.length - 1));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}