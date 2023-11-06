package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-06 13:45:40
 * @link https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
public class T84LargestRectangleInHistogram {

    public static void main(String[] args) {
        Solution solution = new T84LargestRectangleInHistogram().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stk = new ArrayDeque<>();
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        // 左边比当前位置元素小的位置，也就是当前位置围成的长方形的左边缘-1
        for (int i = 0; i < heights.length; ++i) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        stk.clear();
        // 右边比当前位置元素小的位置，也就是当前位置围成的长方形的右边缘+1
        for (int i = heights.length - 1; i >= 0; --i) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            right[i] = stk.isEmpty() ? heights.length : stk.peek();
            stk.push(i);
        }

        int result = 0;
        for (int i = 0; i < heights.length; ++i) {
            result = Math.max(result, (right[i] - left[i] - 1) * heights[i]);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}