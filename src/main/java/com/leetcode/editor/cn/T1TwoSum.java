package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-06 16:20:27
 * @link https://leetcode.com/problems/two-sum/
 */
public class T1TwoSum {

    public static void main(String[] args) {
        Solution solution = new T1TwoSum().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mmap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (mmap.containsKey(target - nums[i])) {
                return new int[]{mmap.get(target - nums[i]), i};
            }
            mmap.put(nums[i], i);
        }
        return new int[]{};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}