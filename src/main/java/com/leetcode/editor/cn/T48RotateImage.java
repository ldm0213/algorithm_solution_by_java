package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-06 17:56:57
 * @link https://leetcode.com/problems/rotate-image/
 */
public class T48RotateImage {

    public static void main(String[] args) {
        Solution solution = new T48RotateImage().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m / 2; ++i) {
            for (int j = 0; j < n; ++j) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[m-i-1][j];
                matrix[m-i-1][j] = t;
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < i; ++j) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}