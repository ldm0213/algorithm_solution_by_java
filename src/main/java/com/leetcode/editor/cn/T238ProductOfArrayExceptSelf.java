package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-22 10:17:35
 * @link https://leetcode.com/problems/product-of-array-except-self/
 */
public class T238ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        Solution solution = new T238ProductOfArrayExceptSelf().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        Arrays.fill(l, 1);
        Arrays.fill(r, 1);
        for (int i = 1; i < nums.length; ++i) {
            l[i] = l[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; --i) {
            r[i] = r[i + 1] * nums[i + 1];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            result[i] = l[i] * r[i];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}