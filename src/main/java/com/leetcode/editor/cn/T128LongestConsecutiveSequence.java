package com.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author  lidongmeng
 * @date 2023-11-09 10:05:21
 * @link https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class T128LongestConsecutiveSequence {

    public static void main(String[] args) {
        Solution solution = new T128LongestConsecutiveSequence().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mset = new HashSet<>();
        int result = 0;
        for (int num: nums) mset.add(num);
        for (int num: nums) {
            if (!mset.contains(num)) continue;
            int pre = num, next = num + 1;
            while (mset.contains(pre)) mset.remove(pre--);
            while (mset.contains(next)) mset.remove(next++);
            result = Math.max(result, next - pre - 1);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}