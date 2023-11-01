package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 20:54:44
 * @link https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */
public class T80RemoveDuplicatesFromSortedArrayIi {

    public static void main(String[] args) {
        Solution solution = new T80RemoveDuplicatesFromSortedArrayIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; ) {
            int num = nums[i], y = i;
            nums[index++] = nums[i];
            while (i < nums.length && nums[i] == num) ++i;
            if (i - y >= 2) nums[index++] = num;
        }
        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}