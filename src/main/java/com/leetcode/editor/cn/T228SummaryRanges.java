package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-21 21:06:59
 * @link https://leetcode.com/problems/summary-ranges/
 */
public class T228SummaryRanges {

    public static void main(String[] args) {
        Solution solution = new T228SummaryRanges().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int index = 0, len = nums.length;
        while (index < len) {
            int start = index++;
            while (index < len && nums[index] == nums[index-1] + 1) ++index;
            result.add("" + nums[start] + ((start == index-1) ? "" : "->" + nums[index-1]));
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}