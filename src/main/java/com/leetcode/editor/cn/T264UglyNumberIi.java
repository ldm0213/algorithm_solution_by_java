package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-22 10:48:38
 * @link https://leetcode.com/problems/ugly-number-ii/
 */
public class T264UglyNumberIi {

    public static void main(String[] args) {
        Solution solution = new T264UglyNumberIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        int twos = 0, threes = 0, fives = 0;
        for (int i = 1; i < n; ++i) {
            int two = nums.get(twos) * 2;
            int three = nums.get(threes) * 3;
            int five = nums.get(fives) * 5;

            int num = Math.min(two, Math.min(five, three));
            if (num == two) ++twos;
            if (num == three) ++threes;
            if (num == five) ++fives;

            nums.add(num);
        }
        return nums.get(nums.size() - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}