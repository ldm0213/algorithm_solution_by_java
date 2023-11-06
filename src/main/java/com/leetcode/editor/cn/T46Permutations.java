package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-01 19:44:27
 * @link https://leetcode.com/problems/permutations/
 */
public class T46Permutations {

    public static void main(String[] args) {
        Solution solution = new T46Permutations().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void backtrack(int[] nums, int level, List<Integer> current, List<List<Integer>> result, int[] visited) {
        if (level == nums.length) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = 0; i < nums.length; ++i) {
                if (visited[i] == 1) continue;
                visited[i] = 1;
                current.add(nums[i]);
                backtrack(nums, level + 1, current, result, visited);
                current.remove(current.size() - 1);
                visited[i] = 0;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int[] visited = new int[nums.length];
        backtrack(nums, 0, current, result, visited);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}