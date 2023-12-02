package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 17:17:04
 * @link https://leetcode.com/problems/excel-sheet-column-title/
 */
public class T168ExcelSheetColumnTitle {

    public static void main(String[] args) {
        Solution solution = new T168ExcelSheetColumnTitle().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber -= 1;
            sb.append((char)(columnNumber % 26 + 'A'));
            columnNumber = columnNumber / 26;
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}