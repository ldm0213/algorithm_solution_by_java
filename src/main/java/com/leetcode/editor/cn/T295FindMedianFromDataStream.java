package com.leetcode.editor.cn;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author  lidongmeng
 * @date 2023-11-01 11:54:35
 * @link https://leetcode.com/problems/find-median-from-data-stream/
 */
public class T295FindMedianFromDataStream {

    public static void main(String[] args) {
        Solution solution = new T295FindMedianFromDataStream().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class MedianFinder {
    // left表示左树，大顶堆,right表示右树，小顶堆，保证left树size大于right树
    Queue<Integer> right = new PriorityQueue<>((a, b) -> a - b);
    Queue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
    public MedianFinder() {

    }
    
    public void addNum(int num) {
        left.offer(num);
        right.offer(left.poll());
        if (right.size() > left.size()) {
            left.offer(right.poll());
        }
    }
    
    public double findMedian() {
        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return left.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
//leetcode submit region end(Prohibit modification and deletion)

}