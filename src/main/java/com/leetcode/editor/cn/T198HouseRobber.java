package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-05 17:28:36
 * @link https://leetcode.com/problems/house-robber/
 */
public class T198HouseRobber {

    public static void main(String[] args) {
        Solution solution = new T198HouseRobber().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rob(int[] nums) {
         int prev = 0, prevprev = 0;
         for (int i = 0; i < nums.length; ++i) {
             int t = Math.max(prev, prevprev + nums[i]);
             prevprev = prev;
             prev = t;
         }
         return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}