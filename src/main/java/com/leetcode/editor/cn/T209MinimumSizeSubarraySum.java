package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 10:02:57
 * @link https://leetcode.com/problems/minimum-size-subarray-sum/
 */
public class T209MinimumSizeSubarraySum {

    public static void main(String[] args) {
        Solution solution = new T209MinimumSizeSubarraySum().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0, l = 0, index = 0;
        while (index < nums.length) {
            sum += nums[index];
            while (l <= index && sum >= target) {
                result = Math.min(result, index - l + 1);
                sum -= nums[l++];
            }
            ++index;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}