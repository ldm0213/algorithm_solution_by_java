package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-01 11:18:17
 * @link https://leetcode.com/problems/compare-version-numbers/
 */
public class T165CompareVersionNumbers {

    public static void main(String[] args) {
        Solution solution = new T165CompareVersionNumbers().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length(), len2 = version2.length();
        int i = 0, j = 0;
        while (i < len1 || j < len2) {
            int x = 0, y = 0;
            for (; i < len1 && version1.charAt(i) != '.'; ++i) {
                x = x * 10 + (version1.charAt(i) - '0');
            }
            i++;
            for (; j < len2 && version2.charAt(j) != '.'; ++j) {
                y = y * 10 + (version2.charAt(j) - '0');
            }
            j++;
            if (x < y) return -1;
            else if (x > y) return 1;
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}