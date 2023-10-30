package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-27 17:33:47
 * @link https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 */
public class T81SearchInRotatedSortedArrayIi {

    public static void main(String[] args) {
        Solution solution = new T81SearchInRotatedSortedArrayIi().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            while (l < r && nums[l] == nums[r]) ++l;
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] >= nums[l]) {
                if (target < nums[mid] && target >= nums[l]) {
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
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}