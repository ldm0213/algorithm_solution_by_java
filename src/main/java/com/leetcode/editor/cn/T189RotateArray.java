package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-01 11:30:18
 * @link https://leetcode.com/problems/rotate-array/
 */
public class T189RotateArray {

    public static void main(String[] args) {
        Solution solution = new T189RotateArray().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void reverseList(int[] nums, int l, int r) {
        while (l < r) {
            int num = nums[l];
            nums[l] = nums[r];
            nums[r] = num;
            ++l;
            --r;
        }
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int len = nums.length - 1;
        reverseList(nums, 0, len - k);
        reverseList(nums, len - k + 1, len);
        reverseList(nums, 0, len);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}