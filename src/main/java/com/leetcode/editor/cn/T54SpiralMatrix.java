package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-07 10:51:05
 * @link https://leetcode.com/problems/spiral-matrix/
 */
public class T54SpiralMatrix {

    public static void main(String[] args) {
        Solution solution = new T54SpiralMatrix().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int left = 0, right = n - 1, top = 0, down = m - 1;
        while (left < n && right >= 0 && top < m && down >= 0) {
            // 从左到右
            for (int i = left; i <= right; ++i) result.add(matrix[top][i]);
            top++;
            if (top > down) break;

            for (int i = top; i <= down; ++i) result.add(matrix[i][right]);
            right--;
            if (left > right) break;

            for (int i = right; i >= left; --i) result.add(matrix[down][i]);
            down--;
            if (top > down) break;

            for (int i = down; i >= top; --i) result.add(matrix[i][left]);
            left++;
            if (left > right) break;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}