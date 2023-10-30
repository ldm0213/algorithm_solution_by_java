package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 13:29:22
 * @link https://leetcode.com/problems/h-index-ii/
 */
public class T275HIndexIi {

    public static void main(String[] args) {
        Solution solution = new T275HIndexIi().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hIndex(int[] citations) {
        int l = 0, r = citations.length - 1, len = citations.length;
        // 找到citations[i] == i的位置
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (citations[mid] == len - mid) return len - mid;
            else if (citations[mid] > len - mid) r = mid - 1;
            else l = mid + 1;
        }
        return len - l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}