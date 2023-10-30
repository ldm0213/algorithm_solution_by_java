package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-27 17:50:12
 * @link https://leetcode.com/problems/search-a-2d-matrix/
 */
public class T74SearchA2dMatrix {

    public static void main(String[] args) {
        Solution solution = new T74SearchA2dMatrix().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m * n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int x = mid / n;
            int y = mid % n;
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}