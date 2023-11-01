package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-10-31 18:12:21
 * @link https://leetcode.com/problems/3sum-closest/
 */
public class T16ThreeSumClosest {

    public static void main(String[] args) {
        Solution solution = new T16ThreeSumClosest().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; ++i) {
            if (i != 0 && nums[i] == nums[i-1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (Math.abs(result - target) > Math.abs(sum - target)) result = sum;
                if (sum == target) return sum;
                else if (sum < target) ++l;
                else --r;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}