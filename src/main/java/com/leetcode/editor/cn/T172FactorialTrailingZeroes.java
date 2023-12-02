package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 17:15:55
 * @link https://leetcode.com/problems/factorial-trailing-zeroes/
 */
public class T172FactorialTrailingZeroes {

    public static void main(String[] args) {
        Solution solution = new T172FactorialTrailingZeroes().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trailingZeroes(int n) {
        // 让求一个数的阶乘末尾0的个数，也就是要找乘数中 10 的个数，
        // 而 10 可分解为2和5，而2的数量又远大于5的数量（比如1到 10 中有2个5，5个2），
        // 那么此题即便为找出5的个数。仍需注意的一点就是，像 25，125，这样的不只含有一个5的数字需要考虑进去。
        int cnt = 0;
        while (n != 0) {
            cnt += n / 5;
            n /= 5;
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}