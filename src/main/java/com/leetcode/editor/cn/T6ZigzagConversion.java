package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-07 10:15:53
 * @link https://leetcode.com/problems/zigzag-conversion/
 */
public class T6ZigzagConversion {

    public static void main(String[] args) {
        Solution solution = new T6ZigzagConversion().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        int gap = 2 * numRows - 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; ++i) {
            for (int j = i; j < s.length(); j += gap) {
                sb.append(s.charAt(j));
                int pos = j + gap - 2 * i;
                if (i != 0 && i != numRows - 1 && pos < s.length()) sb.append(s.charAt(pos));
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}