package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 21:21:06
 * @link https://leetcode.com/problems/ugly-number/
 */
public class T263UglyNumber {

    public static void main(String[] args) {
        Solution solution = new T263UglyNumber().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}