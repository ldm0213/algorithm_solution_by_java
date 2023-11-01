package com.leetcode.editor.cn;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author  lidongmeng
 * @date 2023-10-31 19:57:37
 * @link https://leetcode.com/problems/next-permutation/
 */
public class T31NextPermutation {

    public static void main(String[] args) {
        Solution solution = new T31NextPermutation().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void swap(int[] nums, int p, int q) {
        int num = nums[q];
        nums[q] = nums[p];
        nums[p] = num;
    }
    void reverseArr(int[] nums, int p, int q) {
        while (p < q) {
            swap(nums, p, q);
            ++p;
            --q;
        }
    }
    public void nextPermutation(int[] nums) {
        int p = nums.length - 2;
        // 后半段必然是按照从大到小顺序排列好的，最大序
        while (p >= 0 && nums[p] >= nums[p+1]) --p;
        if (p < 0) {
            reverseArr(nums, 0, nums.length - 1);
        } else {
            // 找到第一个比要替换的数字大的数字，因为后半段是逆序的，所以从后往前找即可
            int q = nums.length - 1;
            while (q >= 0 && nums[q] <= nums[p]) --q;
            swap(nums, p, q);
            Arrays.sort(nums, p + 1, nums.length);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}