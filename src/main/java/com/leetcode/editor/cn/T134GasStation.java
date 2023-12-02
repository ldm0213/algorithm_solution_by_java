package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-08 19:23:10
 * @link https://leetcode.com/problems/gas-station/
 */
public class T134GasStation {

    public static void main(String[] args) {
        Solution solution = new T134GasStation().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, sum = 0, start = 0;
        for (int i = 0; i < cost.length; ++i) {
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }
        }
        return total < 0 ? -1 : start;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}