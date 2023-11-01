package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 20:58:08
 * @link https://leetcode.com/problems/merge-sorted-array/
 */
public class T88MergeSortedArray {

    public static void main(String[] args) {
        Solution solution = new T88MergeSortedArray().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1, p = m - 1, q = n - 1;
        while (p >= 0 && q >= 0) {
            if (nums1[p] > nums2[q]) {
                nums1[index--] = nums1[p];
                p--;
            } else {
                nums1[index--] = nums2[q];
                q--;
            }
        }
        while (q >= 0) nums1[index--] = nums2[q--];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}