package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 17:18:11
 * @link https://leetcode.com/problems/excel-sheet-column-number/
 */
public class T171ExcelSheetColumnNumber {

    public static void main(String[] args) {
        Solution solution = new T171ExcelSheetColumnNumber().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); ++i) {
            int t = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + t;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}