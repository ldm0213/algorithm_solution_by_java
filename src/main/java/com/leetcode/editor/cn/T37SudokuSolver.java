package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-08 20:28:26
 * @link https://leetcode.com/problems/sudoku-solver/
 */
public class T37SudokuSolver {

    public static void main(String[] args) {
        Solution solution = new T37SudokuSolver().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    boolean isValid(char[][] board, int x, int y, char ch) {
        // row&col
        for (int j = 0; j < 9; ++j) {
            if (board[x][j] == ch) return false;
            if (board[j][y] == ch) return false;
        }

        // 3*3 cell
        for (int i = x / 3 * 3; i < (x / 3 + 1) * 3; i++) {
            for (int j = y / 3 * 3; j < (y / 3 + 1) * 3; ++j) {
                if (board[i][j] == ch) return false;
            }
        }
        return true;
    }

    boolean helper(char[][] board, int x, int y) {
        if (x == 9) return true;
        if (y == 9) return helper(board, x+1, 0);
        if (board[x][y] != '.') return helper(board, x, y+1);

        for (int i = 1; i <= 9; ++i) {
            char ch = (char)('0' + i);
            if (!isValid(board, x, y, ch)) continue;
            board[x][y] = ch;
            if (helper(board, x, y+1)) return true;
            board[x][y] = '.';
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}