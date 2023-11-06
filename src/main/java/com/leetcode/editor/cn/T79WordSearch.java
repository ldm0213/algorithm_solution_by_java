package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-01 20:45:38
 * @link https://leetcode.com/problems/word-search/
 */
public class T79WordSearch {

    public static void main(String[] args) {
        Solution solution = new T79WordSearch().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    boolean dfs(char[][] board, String word, int pos,
                int x, int y, int m, int n, boolean[][] visited) {
        if (pos == word.length()) return true;
        if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) return false;
        if (board[x][y] != word.charAt(pos)) return false;

        visited[x][y] = true;
        int[] xDir = {1, -1, 0, 0};
        int[] yDir = {0, 0, 1, -1};
        if (dfs(board, word, pos+1, x + xDir[0], y + yDir[0], m, n, visited) ||
                dfs(board, word, pos+1, x + xDir[1], y + yDir[1], m, n, visited) ||
                dfs(board, word, pos+1, x + xDir[2], y + yDir[2], m, n, visited) ||
                dfs(board, word, pos+1, x + xDir[3], y + yDir[3], m, n, visited))
            return true;
        visited[x][y] = false;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] == word.charAt(0) &&
                    dfs(board, word, 0, i, j, m, n, visited))
                    return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}