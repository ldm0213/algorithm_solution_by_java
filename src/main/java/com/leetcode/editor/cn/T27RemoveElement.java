package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 19:52:12
 * @link https://leetcode.com/problems/remove-element/
 */
public class T27RemoveElement {

    public static void main(String[] args) {
        Solution solution = new T27RemoveElement().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) nums[index++] = nums[i];
        }
        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}