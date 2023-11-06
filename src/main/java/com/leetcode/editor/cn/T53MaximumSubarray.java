package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-03 17:19:47
 * @link https://leetcode.com/problems/maximum-subarray/
 */
public class T53MaximumSubarray {

    public static void main(String[] args) {
        Solution solution = new T53MaximumSubarray().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            sum += nums[i];
            if (sum < nums[i]) sum = nums[i];
            result = Math.max(result, sum);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}