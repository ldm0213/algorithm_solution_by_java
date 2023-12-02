package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-11 15:54:27
 * @link https://leetcode.com/problems/min-stack/
 */
public class T155MinStack {

	//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
    Deque<Integer> stk1;
    Deque<Integer> stk2;

    public MinStack() {
        stk1 = new ArrayDeque<>();
        stk2 = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stk1.push(val);
        if (stk2.isEmpty() || stk2.getFirst() >= val) {
            stk2.push(val);
        }
    }
    
    public void pop() {
        int t = stk1.pop();
        if (stk2.getFirst() == t) stk2.pop();
    }
    
    public int top() {
        return stk1.getFirst();
    }
    
    public int getMin() {
        return stk2.getFirst();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}