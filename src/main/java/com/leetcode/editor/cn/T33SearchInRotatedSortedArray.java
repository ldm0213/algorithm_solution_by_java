package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-27 17:28:30
 * @link https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class T33SearchInRotatedSortedArray {

    public static void main(String[] args) {
        Solution solution = new T33SearchInRotatedSortedArray().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[l]) {
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}