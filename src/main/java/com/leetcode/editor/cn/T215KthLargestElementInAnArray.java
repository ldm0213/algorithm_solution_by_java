package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 17:56:51
 * @link https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class T215KthLargestElementInAnArray {

    public static void main(String[] args) {
        Solution solution = new T215KthLargestElementInAnArray().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int quickSort(int[] nums, int l, int r, int k) {
         int pivot = nums[l];
         int p = l, q = r;
         while (p < q) {
             // 从后往前找到第一个小于pivot的数字
             while (p < q && nums[q] >= pivot) --q;
             if (p < q) nums[p++] = nums[q];

             while (p < q && nums[p] < pivot) ++p;
             if (p < q) nums[q--] = nums[p];
         }
         nums[p] = pivot;
         if (p - l + 1 == k) return pivot;
         else if (p - l + 1 > k) return quickSort(nums, l, p-1, k);
         else return quickSort(nums, p+1, r, k - (p - l + 1));
    }

    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, nums.length - k + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}