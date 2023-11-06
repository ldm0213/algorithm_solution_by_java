package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-01 19:35:47
 * @link https://leetcode.com/problems/combination-sum-iii/
 */
public class T216CombinationSumIii {

    public static void main(String[] args) {
        Solution solution = new T216CombinationSumIii().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void backtrack(int k, int target, int pos, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k && target == 0) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = pos; i <= 9; ++i) {
                if (i > target) break;
                current.add(i);
                backtrack(k, target - i, i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(k, n, 1, current, result);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}