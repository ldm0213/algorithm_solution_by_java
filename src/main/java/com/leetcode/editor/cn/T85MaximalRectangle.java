package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-06 11:48:49
 * @link https://leetcode.com/problems/maximal-rectangle/
 */
public class T85MaximalRectangle {

    public static void main(String[] args) {
        Solution solution = new T85MaximalRectangle().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int getMax(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();

        for (int i = 0; i < n; ++i) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }

        stk.clear();
        for (int i = n-1; i >= 0; --i) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            right[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }

        int result = 0;
        for (int i = 0; i < n; ++i) {
            result = Math.max(result, (right[i] - left[i] - 1) * heights[i]);
        }
        return result;
    }

    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, result = 0;
        int[] height = new int[n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == '1') height[j] += 1;
                else height[j] = 0;
            }
            result = Math.max(result, getMax(height));
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}