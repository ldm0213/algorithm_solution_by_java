package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-22 10:17:37
 * @link https://leetcode.com/problems/majority-element-ii/
 */
public class T229MajorityElementIi {

    public static void main(String[] args) {
        Solution solution = new T229MajorityElementIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0, num1 = Integer.MIN_VALUE, num2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            if (num1 == nums[i]) {
                ++cnt1;
            } else if (num2 == nums[i]) {
                ++cnt2;
            } else if (cnt1 == 0) {
                num1 = nums[i];
                ++cnt1;
            } else if (cnt2 == 0) {
                num2 = nums[i];
                ++cnt2;
            } else {
                --cnt1;
                --cnt2;
            }
        }

        cnt1 = cnt2 = 0;
        for (int num: nums) {
            if (num == num1) ++cnt1;
            if (num == num2) ++cnt2;
        }
        List<Integer> result = new ArrayList<>();
        if (cnt1 > nums.length / 3) result.add(num1);
        if (cnt2 > nums.length / 3) result.add(num2);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}