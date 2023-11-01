package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 17:49:29
 * @link https://leetcode.com/problems/container-with-most-water/
 */
public class T11ContainerWithMostWater {

    public static void main(String[] args) {
        Solution solution = new T11ContainerWithMostWater().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, result = 0;
        while (l < r) {
            result = Math.max(Math.min(height[l], height[r]) * (r - l), result);
            if (height[l] < height[r]) l++;
            else r--;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}