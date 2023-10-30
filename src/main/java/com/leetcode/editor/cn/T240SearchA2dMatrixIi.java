package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-27 18:00:49
 * @link https://leetcode.com/problems/search-a-2d-matrix-ii/
 */
public class T240SearchA2dMatrixIi {

    public static void main(String[] args) {
        Solution solution = new T240SearchA2dMatrixIi().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int x = 0, y = n - 1;
        while (x >= 0 && x < m && y >= 0 && y < n) {
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] < target) {
                x = x + 1;
            } else {
                y = y - 1;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}