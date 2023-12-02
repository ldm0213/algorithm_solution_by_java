package com.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * @author  lidongmeng
 * @date 2023-11-09 14:28:57
 * @link https://leetcode.com/problems/n-queens-ii/
 */
public class T52NQueensIi {

    public static void main(String[] args) {
        Solution solution = new T52NQueensIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int result = 0;
    void backtrack(int n, int row, Set<Integer> colSet, Set<Integer> diag1Set, Set<Integer> diag2Set) {
        if (row == n) {
            result++;
        } else {
            for (int i = 0; i < n; ++i) {
                int col = i, diag1 = row - i, diag2 = i + row;
                if (colSet.contains(col) || diag1Set.contains(diag1) || diag2Set.contains(diag2)) continue;
                colSet.add(col); diag1Set.add(diag1); diag2Set.add(diag2);
                backtrack(n, row+1, colSet, diag1Set, diag2Set);
                colSet.remove(col); diag1Set.remove(diag1); diag2Set.remove(diag2);
            }
        }
    }
    public int totalNQueens(int n) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> diag1 = new HashSet<>();
        Set<Integer> diag2 = new HashSet<>();
        backtrack(n, 0, col, diag1, diag2);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}