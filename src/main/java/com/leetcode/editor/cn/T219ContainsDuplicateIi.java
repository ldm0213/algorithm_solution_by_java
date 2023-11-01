package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-01 16:28:45
 * @link https://leetcode.com/problems/contains-duplicate-ii/
 */
public class T219ContainsDuplicateIi {

    public static void main(String[] args) {
        Solution solution = new T219ContainsDuplicateIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mmap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (mmap.containsKey(nums[i]) && i - mmap.get(nums[i]) <= k) return true;
            mmap.put(nums[i], i);
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}