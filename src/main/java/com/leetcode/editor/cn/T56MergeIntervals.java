package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-07 11:38:01
 * @link https://leetcode.com/problems/merge-intervals/
 */
public class T56MergeIntervals {

    public static void main(String[] args) {
        Solution solution = new T56MergeIntervals().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][2];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        int start = intervals[0][0], end = intervals[0][1], index = 1;
        while (index < intervals.length) {
            if (end < intervals[index][0]) {
                merged.add(new int[]{start, end});
                start = intervals[index][0];
                end = intervals[index][1];
            } else {
                end = Math.max(end, intervals[index][1]);
            }
            ++index;
        }
        merged.add(new int[]{start, end});
        return merged.toArray(new int[merged.size()][2]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}