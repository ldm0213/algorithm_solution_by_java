package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-01 20:16:24
 * @link https://leetcode.com/problems/combinations/
 */
public class T77Combinations {

    public static void main(String[] args) {
        Solution solution = new T77Combinations().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void backtrack(int n, int k, int pos, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = pos; i <= n; ++i) {
                if (current.size() < k) {
                    current.add(i);
                    backtrack(n, k, i+1, current, result);
                    current.remove(current.size() - 1);
                }
            }
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(n, k, 1, current, result);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}