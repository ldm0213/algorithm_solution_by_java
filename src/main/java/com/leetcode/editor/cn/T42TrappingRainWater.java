package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 20:24:45
 * @link https://leetcode.com/problems/trapping-rain-water/
 */
public class T42TrappingRainWater {

    public static void main(String[] args) {
        Solution solution = new T42TrappingRainWater().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trapV1(int[] height) {
        int len = height.length;
        int[] l = new int[len];
        int[] r = new int[len];
        l[0] = height[0];
        for (int i = 1; i < len; ++i) l[i] = Math.max(height[i], l[i-1]);
        r[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; --i) r[i] = Math.max(height[i], r[i + 1]);
        int result = 0;
        for (int i = 1; i < len - 1; ++i) {
            result += Math.max(Math.min(l[i - 1], r[i + 1]) - height[i], 0);
        }
        return result;
    }

    public int trap(int[] height) {
        int l = 1, r = height.length - 2, result = 0;
        int maxLeft = 0, maxRight = 0;
        for (int i = 1; i < height.length - 1; ++i) {
            if (height[l - 1] < height[r + 1]) {
                maxLeft = Math.max(maxLeft, height[l - 1]);
                result += Math.max(0, maxLeft - height[l]);
                ++l;
            } else {
                maxRight = Math.max(maxRight, height[r + 1]);
                result += Math.max(0, maxRight - height[r]);
                r--;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}