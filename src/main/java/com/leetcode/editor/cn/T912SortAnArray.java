package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-28 10:00:47
 * @link https://leetcode.com/problems/sort-an-array/
 */
public class T912SortAnArray {

    public static void main(String[] args) {
        Solution solution = new T912SortAnArray().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void quickSort(int[] nums, int l, int r) {
        if (l > r) return ;
        int pivot = nums[l];
        int p = l, q = r;
        while (p < q) {
            while (p < q && nums[q] >= pivot) --q;
            if (p < q) nums[p++] = nums[q];

            while (p < q && nums[p] < pivot) ++p;
            if (p < q) nums[q--] = nums[p];
        }
        nums[p] = pivot;
        quickSort(nums, l, p-1);
        quickSort(nums, p+1, r);
    }


    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}