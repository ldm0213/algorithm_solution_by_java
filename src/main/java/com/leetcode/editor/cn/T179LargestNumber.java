package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-21 17:41:03
 * @link https://leetcode.com/problems/largest-number/
 */
public class T179LargestNumber {

    public static void main(String[] args) {
        Solution solution = new T179LargestNumber().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        // 转换成包装类型，以便传入 Comparator 对象（此处为 lambda 表达式）
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) { numsArr[i] = nums[i]; }

        Arrays.sort(numsArr, (a, b) -> ("" + b + a).compareTo("" + a + b));
        if (numsArr[0] == 0) return "0";

        StringBuilder result = new StringBuilder();
        for (Integer num: numsArr) {
            result.append(num);
        }
        return result.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}