package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-28 16:34:14
 * @link https://leetcode.com/problems/find-peak-element/
 */
public class T162FindPeakElement {

    public static void main(String[] args) {
        Solution solution = new T162FindPeakElement().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            boolean midL = mid != 0 ? nums[mid] > nums[mid - 1] : true;
            boolean midR = mid != nums.length - 1 ? nums[mid] > nums[mid + 1] : true;
            if (midL && midR) return mid;
            if (midL) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}