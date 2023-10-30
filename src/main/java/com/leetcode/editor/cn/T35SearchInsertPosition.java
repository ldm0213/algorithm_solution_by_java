package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-27 17:26:54
 * @link https://leetcode.com/problems/search-insert-position/
 */
public class T35SearchInsertPosition {

    public static void main(String[] args) {
        Solution solution = new T35SearchInsertPosition().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}