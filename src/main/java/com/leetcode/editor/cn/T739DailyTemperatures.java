package com.leetcode.editor.cn;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-27 14:24:15
 * @link https://leetcode.com/problems/daily-temperatures/
 */
public class T739DailyTemperatures {

    public static void main(String[] args) {
        Solution solution = new T739DailyTemperatures().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Arrays.fill(result, 0);
        // 可以维护一个存储下标的单调递减栈，从栈底到栈顶的下标对应的温度列表中的温度依次递减。
        // 如果一个下标在单调栈里，则表示尚未找到下一次温度更高的下标。
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; ++i) {
            while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int index = stk.pop();
                result[index] = i - index;
            }
            stk.push(i);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}