package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-01 11:35:17
 * @link https://leetcode.com/problems/happy-number/
 */
public class T202HappyNumber {

    public static void main(String[] args) {
        Solution solution = new T202HappyNumber().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int getNext(int n) {
        int y = 0;
        while (n != 0) {
            y += (n % 10) * (n % 10);
            n /= 10;
        }
        return y;
    }
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        while (true) {
            slow = getNext(slow);
            fast = getNext(fast);
            fast = getNext(fast);
            if (fast == slow) break;
        }
        return slow == 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}