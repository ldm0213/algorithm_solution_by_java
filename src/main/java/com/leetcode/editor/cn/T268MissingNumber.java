package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 11:03:24
 * @link https://leetcode.com/problems/missing-number/
 */
public class T268MissingNumber {

    public static void main(String[] args) {
        Solution solution = new T268MissingNumber().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumberV1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }

    public int missingNumber(int[] nums) {
        int xor = 0, n = nums.length;
        for (int i = 0; i < nums.length; ++i) {
            xor ^= nums[i];
        }
        for (int i = 0; i <= n; ++i) {
            xor ^= i;
        }
        return xor;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}