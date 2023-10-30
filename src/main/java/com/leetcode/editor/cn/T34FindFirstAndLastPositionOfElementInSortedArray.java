package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-27 16:56:33
 * @link https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class T34FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        Solution solution = new T34FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int searchLeft(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                r = mid - 1;
            }
        }
        return l < nums.length && nums[l] == target ? l : -1;
    }

        private int searchRight(int[] nums, int target) {
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] < target) {
                    l = mid + 1;
                } else if (nums[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return r >= 0 && nums[r] == target ? r : -1;
        }
    public int[] searchRange(int[] nums, int target) {
        int left = searchLeft(nums, target);
        if (left == -1) return new int[]{-1, -1};
        int right = searchRight(nums, target);
        return new int[]{left, right};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}