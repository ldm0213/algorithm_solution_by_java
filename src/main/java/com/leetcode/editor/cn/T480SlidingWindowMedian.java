package com.leetcode.editor.cn;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author  lidongmeng
 * @date 2023-11-01 16:46:02
 * @link https://leetcode.com/problems/sliding-window-median/
 */
public class T480SlidingWindowMedian {

    public static void main(String[] args) {
        Solution solution = new T480SlidingWindowMedian().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        int index = 0;
        Queue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
        Queue<Integer> right = new PriorityQueue<>();
        for (int i = 0; i < nums.length; ++i) {
            if (i >= k) {
                // 删除一个元素
                if (left.contains(nums[i - k])) left.remove(nums[i - k]);
                else right.remove(nums[i - k]);
            }
            // 添加
            left.offer(nums[i]);
            right.offer(left.poll());
            while (right.size() > left.size()) {
                left.offer(right.poll());
            }

            if (i >= k - 1) {
                // 结果添加
                result[index++] = k % 2 == 0 ? ((double)left.peek() + right.peek()) / 2.0 : left.peek();
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}