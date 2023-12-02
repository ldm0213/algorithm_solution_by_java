package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 11:06:35
 * @link https://leetcode.com/problems/set-matrix-zeroes/
 */
public class T73SetMatrixZeroes {

    public static void main(String[] args) {
        Solution solution = new T73SetMatrixZeroes().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZero = false, firstColZero = false;
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; ++i) if (matrix[i][0] == 0) firstColZero = true;
        for (int j = 0; j < n; ++j) if (matrix[0][j] == 0) firstRowZero = true;
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; ++i) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < n; ++j) matrix[i][j] = 0;
            }
        }

        for (int j = 1; j < n; ++j) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < m; ++i) matrix[i][j] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < m; ++i) matrix[i][0] = 0;
        }

        if (firstRowZero) {
            for (int j = 0; j < n; ++j) matrix[0][j] = 0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}