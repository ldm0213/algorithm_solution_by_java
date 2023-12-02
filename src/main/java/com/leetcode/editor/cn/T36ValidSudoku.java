package com.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * @author  lidongmeng
 * @date 2023-11-08 20:06:38
 * @link https://leetcode.com/problems/valid-sudoku/
 */
public class T36ValidSudoku {

    public static void main(String[] args) {
        Solution solution = new T36ValidSudoku().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length, n = board.length;
        // 行
        for (int i = 0; i < m; ++i) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < n; ++j) {
                if (board[i][j] != '.' && set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        // 列
        for (int j = 0; j < n; ++j) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < m; ++i) {
                if (board[i][j] != '.' && set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }


        // 3*3 cell
        for (int i = 0; i < m; i += 3) {
            for (int j = 0; j < n; j += 3) {
                Set<Character> set = new HashSet<>();
                for (int p = 0; p < 3; ++p) {
                    for (int q = 0; q < 3; ++q) {
                        if (board[i + p][j + q] != '.' && set.contains(board[i + p][j + q])) return false;
                        set.add(board[i + p][j + q]);
                    }
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}