package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-01 20:23:31
 * @link https://leetcode.com/problems/subsets-ii/
 */
public class T90SubsetsIi {

    public static void main(String[] args) {
        Solution solution = new T90SubsetsIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void backtrack(int[] nums, int pos, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = pos; i < nums.length; ++i) {
            if (i != pos && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);
            backtrack(nums, i+1, current, result);
            current.remove(current.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, 0, current, result);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}