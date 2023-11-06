package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-01 19:15:21
 * @link https://leetcode.com/problems/combination-sum/
 */
public class T39CombinationSum {

    public static void main(String[] args) {
        Solution solution = new T39CombinationSum().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void backtrack(int[] candidates, int target, int pos, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = pos; i < candidates.length; ++i) {
                if (candidates[i] > target) break;
                current.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(candidates, target, 0, current, result);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}