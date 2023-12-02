package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-27 21:27:20
 * @link https://leetcode.com/problems/lexicographical-numbers/
 */
public class T386LexicographicalNumbers {

    public static void main(String[] args) {
        Solution solution = new T386LexicographicalNumbers().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void dfs(List<Integer> result, int num, int n) {
        if (num > n) return;
        result.add(num);
        for (int i = num * 10; i <= num * 10 + 9; ++i) {
            dfs(result,  i, n);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; ++i) dfs(result, i, n);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}