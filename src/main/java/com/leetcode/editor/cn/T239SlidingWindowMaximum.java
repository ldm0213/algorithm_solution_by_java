package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author  lidongmeng
 * @date 2023-11-01 16:32:59
 * @link https://leetcode.com/problems/sliding-window-maximum/
 */
public class T239SlidingWindowMaximum {

    public static void main(String[] args) {
        Solution solution = new T239SlidingWindowMaximum().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
    class Pair {
        public int first;
        public int second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
class Solution {
    public int[] maxSlidingWindowV1(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        Queue<Pair> q = new PriorityQueue<>((a, b) -> b.first - a.first);
        for (int i = 0; i < nums.length; ++i) {
            while (!q.isEmpty() && q.peek().second <= i - k) q.poll();
            q.offer(new Pair(nums[i], i));
            if (i >= k - 1) result[index++] = q.peek().first;
        }
        return result;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        // 双端队列
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            // 1. 入
            while (!q.isEmpty() && nums[q.getLast()] <= nums[i]) {
                // 维护 q 的单调性
                q.removeLast();
            }
            // 入队
            q.addLast(i);
            // 2. 出
            if (i - q.getFirst() >= k) {
                // 队首已经离开窗口了
                q.removeFirst();
            }
            // 3. 记录答案
            if (i >= k - 1) {
                // 由于队首到队尾单调递减，所以窗口最大值就是队首
                ans[i - k + 1] = nums[q.getFirst()];
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}