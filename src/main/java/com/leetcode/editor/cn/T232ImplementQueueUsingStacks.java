package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-21 21:12:22
 * @link https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class T232ImplementQueueUsingStacks {

    public static void main(String[] args) {
        Solution solution = new T232ImplementQueueUsingStacks().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {
    Deque<Integer> in;
    Deque<Integer> out;

    public MyQueue() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }

    private void in2out() {
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        if (out.isEmpty()) {
            in2out();
        }
        return out.pop();
    }
    
    public int peek() {
        if (out.isEmpty()) {
            in2out();
        }
        return out.peek();
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}