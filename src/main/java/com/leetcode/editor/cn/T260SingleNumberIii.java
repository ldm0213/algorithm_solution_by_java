package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-22 10:35:40
 * @link https://leetcode.com/problems/single-number-iii/
 */
public class T260SingleNumberIii {

    public static void main(String[] args) {
        Solution solution = new T260SingleNumberIii().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] singleNumber(int[] nums) {
        int t = 0, index = 0;
        for (int num: nums) t ^= num;
        // 找到第一个不相等的位置
        while (index < 32 && ((1 << index) & t) == 0) ++index;
        int[] result = new int[2];
        for (int num: nums) {
            if (((1 << index) & num) == 0) result[1] ^= num;
            else result[0] ^= num;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}