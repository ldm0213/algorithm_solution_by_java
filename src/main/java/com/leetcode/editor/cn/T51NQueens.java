package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-09 13:58:31
 * @link https://leetcode.com/problems/n-queens/
 */
public class T51NQueens {

    public static void main(String[] args) {
        Solution solution = new T51NQueens().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    boolean valid(char[][] current, int n, int x, int y) {
        for (int i = 0; i < n; ++i) if (current[i][y] == 'Q' || current[x][i] == 'Q') return false;
        int xx = x, yy = y;
        while (xx >= 0 && yy >= 0) {
            if (current[xx][yy] == 'Q') return false;
            xx = xx - 1;
            yy = yy - 1;
        }
        xx = x; yy = y;
        while (xx >= 0 && yy < n) {
            if (current[xx][yy] == 'Q') return false;
            xx = xx - 1;
            yy = yy + 1;
        }
        return true;
    }

    void backtrack(List<List<String>> result, char[][] current, int n, int x) {
        if (x == n) {
            List<String> t = new ArrayList<>();
            for (int i = 0; i < n; ++i) t.add(new String(current[i]));
            result.add(t);
            return ;
        }
        for (int i = 0; i < n; ++i) {
            if (valid(current, n, x, i)) {
                current[x][i] = 'Q';
                backtrack(result, current, n, x + 1);
                current[x][i] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] current = new char[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(current[i], '.');
        }
        backtrack(result, current, n, 0);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}