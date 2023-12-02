package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author  lidongmeng
 * @date 2023-11-21 20:28:48
 * @link https://leetcode.com/problems/implement-stack-using-queues/
 */
public class T225ImplementStackUsingQueues {

    public static void main(String[] args) {
        Solution solution = new T225ImplementStackUsingQueues().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q2.offer(x);
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}