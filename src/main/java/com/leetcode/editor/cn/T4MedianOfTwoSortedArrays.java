package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-28 16:02:32
 * @link https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class T4MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        Solution solution = new T4MedianOfTwoSortedArrays().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private double helper(int[] nums1, int pos1, int len1, int[] nums2, int pos2, int len2, int k) {
        if (len1 > len2) return helper(nums2, pos2, len2, nums1, pos1, len1, k);
        if (len1 == 0) return nums2[pos2 + k - 1];
        if (k == 1) return Math.min(nums1[pos1], nums2[pos2]);

        int p = Math.min(k / 2, len1);
        int q = k - p;
        if (nums1[pos1 + p - 1] == nums2[pos2 + q - 1]) {
            return nums1[pos1 + p - 1];
        } else if (nums1[pos1 + p - 1] < nums2[pos2 + q - 1]) {
            return helper(nums1, pos1 + p, len1 - p, nums2, pos2, len2, k - p);
        } else {
            return helper(nums1, pos1, len1, nums2, pos2 + q, len2 - q, k - q);
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if ((m + n) % 2 == 0) {
            return (helper(nums1, 0, m, nums2, 0, n, (m + n) / 2)
                    + helper(nums1, 0, m, nums2, 0, n, (m + n) / 2 + 1)) / 2.0;
        } else {
            return helper(nums1, 0, m, nums2, 0, n, (m + n) / 2 + 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}