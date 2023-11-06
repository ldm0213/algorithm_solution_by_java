package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-03 15:35:07
 * @link https://leetcode.com/problems/surrounded-regions/
 */
public class T130SurroundedRegions {

    public static void main(String[] args) {
        Solution solution = new T130SurroundedRegions().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void dfs(char[][] board, int m, int n, int x, int y) {
        board[x][y] = '$';
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < 4; ++i) {
            int xx = x + dirs[i][0];
            int yy = y + dirs[i][1];
            if (xx >= 0 && xx < m && yy >= 0 && yy < n && board[xx][yy] == 'O') {
                dfs(board, m, n, xx, yy);
            }
        }
    }

    public void solve(char[][] board) {
         int m = board.length, n = board[0].length;
         for (int i = 0; i < m; ++i) {
             for (int j = 0; j < n; ++j) {
                 if ((i == 0 || i == m - 1 || j == 0 || j == n - 1) && board[i][j] == 'O') {
                     dfs(board, m, n, i, j);
                 }
             }
         }
         for (int i = 0; i < m; ++i) {
             for (int j = 0; j < n; ++j) {
                 if (board[i][j] != '$') board[i][j] = 'X';
                 else board[i][j] = 'O';
             }
         }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}