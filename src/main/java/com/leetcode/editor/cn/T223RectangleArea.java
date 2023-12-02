package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-22 09:56:11
 * @link https://leetcode.com/problems/rectangle-area/
 */
public class T223RectangleArea {

    public static void main(String[] args) {
        Solution solution = new T223RectangleArea().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int x1 = Math.max(ax1, bx1);
        int x2 = Math.min(ax2, bx2);
        int y1 = Math.max(ay1, by1);
        int y2 = Math.min(ay2, by2);
        return (ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1) -
                Math.max(x2 - x1, 0) * Math.max(y2 - y1, 0);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}