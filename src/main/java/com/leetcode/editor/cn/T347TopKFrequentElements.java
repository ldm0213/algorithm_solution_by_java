package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author  lidongmeng
 * @date 2023-11-28 10:47:06
 * @link https://leetcode.com/problems/top-k-frequent-elements/
 */
public class T347TopKFrequentElements {

    public static void main(String[] args) {
        Solution solution = new T347TopKFrequentElements().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Queue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        Map<Integer, Integer> mmap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            // 频次统计
            mmap.put(nums[i], mmap.getOrDefault(nums[i], 0) + 1);
        }
        // 加入k个
        for (Map.Entry<Integer, Integer> entry: mmap.entrySet()) {
            q.offer(entry);
            if (q.size() > k) q.poll();
        }

        // 从队列取出来
        int[] result = new int[k];
        int index = k - 1;
        while (!q.isEmpty()) {
            result[index--] = q.poll().getKey();
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}