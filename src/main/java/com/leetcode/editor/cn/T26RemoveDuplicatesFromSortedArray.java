package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 19:50:39
 * @link https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class T26RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        Solution solution = new T26RemoveDuplicatesFromSortedArray().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; ) {
            nums[index++] = nums[i];
            int num = nums[i];
            while (i < nums.length && nums[i] == num) ++i;
        }
        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}