package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-01 11:44:59
 * @link https://leetcode.com/problems/sort-colors/
 */
public class T75SortColors {

    public static void main(String[] args) {
        Solution solution = new T75SortColors().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void swap(int[] nums, int l, int r) {
        int num = nums[l];
        nums[l] = nums[r];
        nums[r] = num;
    }
    public void sortColors(int[] nums) {
        int red = 0, blue = nums.length - 1;
        for (int i = red; i <= blue; ++i) {
            if (nums[i] == 0) {
                swap(nums, red, i);
                red++;
            } else if (nums[i] == 2) {
                swap(nums, blue, i);
                blue--;
                i--;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}