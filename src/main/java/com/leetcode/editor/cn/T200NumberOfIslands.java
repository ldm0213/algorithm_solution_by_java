package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-03 15:50:31
 * @link https://leetcode.com/problems/number-of-islands/
 */
public class T200NumberOfIslands {

    public static void main(String[] args) {
        Solution solution = new T200NumberOfIslands().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void dfs(char[][] grid, int x, int y, int m, int n) {
        grid[x][y] = '2';
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < 4; ++i) {
            int xx = x + dirs[i][0];
            int yy = y + dirs[i][1];
            if (xx >= 0 && xx < m && yy >= 0 && yy < n && grid[xx][yy] == '1') {
                dfs(grid, xx, yy, m, n);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int result = 0, m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == '1') {
                    result++;
                    dfs(grid, i, j, m, n);
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}