package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-28 15:01:48
 * @link https://leetcode.com/problems/valid-triangle-number/
 */
public class T611ValidTriangleNumber {

    public static void main(String[] args) {
        Solution solution = new T611ValidTriangleNumber().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        // 三角形条件，两个最小两个边的值的和大于最大的呢个边值
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int k = i;
            for (int j = i + 1; j < n; ++j) {
                // i和j固定了查找能有几个满足条件的边的值
                while (k + 1 < n && nums[k + 1] < nums[i] + nums[j]) {
                    ++k;
                }
                ans += Math.max(k - j, 0);
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}