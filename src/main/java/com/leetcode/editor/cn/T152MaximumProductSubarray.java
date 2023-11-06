package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-06 15:58:37
 * @link https://leetcode.com/problems/maximum-product-subarray/
 */
public class T152MaximumProductSubarray {

    public static void main(String[] args) {
        Solution solution = new T152MaximumProductSubarray().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(int[] nums) {
        int positive = nums[0], negative = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int mx = positive, mi = negative;
            positive = Math.max(Math.max(mx * nums[i], mi * nums[i]), nums[i]);
            negative = Math.min(Math.min(mx * nums[i], negative * nums[i]), nums[i]);
            result = Math.max(positive, result);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}