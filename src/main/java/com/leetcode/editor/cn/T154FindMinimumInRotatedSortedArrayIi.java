package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-28 16:33:23
 * @link https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */
public class T154FindMinimumInRotatedSortedArrayIi {

    public static void main(String[] args) {
        Solution solution = new T154FindMinimumInRotatedSortedArrayIi().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            while (l < r && nums[l] == nums[r]) ++l;
            if (nums[l] <= nums[r]) return nums[l];
            int mid = l + (r - l) / 2;
            if (nums[l] <= nums[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}