package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-07 11:47:10
 * @link https://leetcode.com/problems/insert-interval/
 */
public class T57InsertInterval {

    public static void main(String[] args) {
        Solution solution = new T57InsertInterval().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        int index = 0, len = intervals.length;
        while (index < len && intervals[index][1] < newInterval[0]) {
            merged.add(intervals[index++]);
        }
        while (index < len && newInterval[1] >= intervals[index][0]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
            index++;
        }
        merged.add(newInterval);
        while (index < len) {
            merged.add(intervals[index++]);
        }
        return merged.toArray(new int[merged.size()][2]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}