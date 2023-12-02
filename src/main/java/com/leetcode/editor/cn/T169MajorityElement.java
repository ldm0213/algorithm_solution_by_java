package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 17:11:01
 * @link https://leetcode.com/problems/majority-element/
 */
public class T169MajorityElement {

    public static void main(String[] args) {
        Solution solution = new T169MajorityElement().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 1, num = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == num) {
                cnt++;
            } else if (cnt == 0) {
                cnt++;
                num = nums[i];
            } else {
                cnt--;
            }
        }
        return num;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}