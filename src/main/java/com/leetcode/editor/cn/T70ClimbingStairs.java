package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-05 09:51:47
 * @link https://leetcode.com/problems/climbing-stairs/
 */
public class T70ClimbingStairs {

    public static void main(String[] args) {
        Solution solution = new T70ClimbingStairs().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        if (n < 2) return 1;
        int prev = 1, prevprev = 1;
        for (int i = 2; i <= n; ++i) {
            int tmp = prev + prevprev;
            prevprev = prev;
            prev = tmp;
        }
        return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}