package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 14:46:49
 * @link https://leetcode.com/problems/first-missing-positive/
 */
public class T41FirstMissingPositive {

    public static void main(String[] args) {
        Solution solution = new T41FirstMissingPositive().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            while (nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int t = nums[i];
                nums[i] = nums[t - 1];
                nums[t - 1] = t;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (nums[i] != i + 1) return i + 1;
        }
        return n + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}