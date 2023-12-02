package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-21 19:55:49
 * @link https://leetcode.com/problems/count-primes/
 */
public class T204CountPrimes {

    public static void main(String[] args) {
        Solution solution = new T204CountPrimes().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countPrimes(int n) {
        int[] primes = new int[n];
        Arrays.fill(primes, 1);
        int result = 0;
        for (int i = 2; i < n; ++i) {
            if (primes[i] != 1) continue;
            result++;
            for (int j = 1; j * i < n; ++j) {
                primes[i * j] = 0;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}