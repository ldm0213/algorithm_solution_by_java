package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 11:00:30
 * @link https://leetcode.com/problems/spiral-matrix-ii/
 */
public class T59SpiralMatrixIi {

    public static void main(String[] args) {
        Solution solution = new T59SpiralMatrixIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, down = n - 1, num = 1;
        while (true) {
            for (int i = left; i <= right; ++i) matrix[top][i] = num++;
            if (++top > down) break;

            for (int i = top; i <= down; ++i) matrix[i][right] = num++;
            if (--right < left) break;

            for (int i = right; i >= left; --i) matrix[down][i] = num++;
            if (--down < top) break;

            for (int i = down; i >= top; --i) matrix[i][left] = num++;
            if (++left > right) break;
        }
        return matrix;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}