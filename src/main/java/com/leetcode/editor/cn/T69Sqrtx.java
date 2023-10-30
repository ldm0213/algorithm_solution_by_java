package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-28 16:10:41
 * @link https://leetcode.com/problems/sqrtx/
 */
public class T69Sqrtx {

    public static void main(String[] args) {
        Solution solution = new T69Sqrtx().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long)mid * mid == x) return mid;
            else if ((long)mid * mid < x) l = mid + 1;
            else r = mid - 1;
        }
        return r;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}