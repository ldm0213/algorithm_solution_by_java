package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-07 14:04:07
 * @link https://leetcode.com/problems/permutation-sequence/
 */
public class T60PermutationSequence {

    public static void main(String[] args) {
        Solution solution = new T60PermutationSequence().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void swapNum(char[] nums, int l, int r) {
        char ch = nums[l];
        nums[l] = nums[r];
        nums[r] = ch;
    }
    void reverseArr(char[] nums, int l, int r) {
        while (l < r) {
            swapNum(nums, l, r);
            l++; r--;
        }
    }
    void nextPermutation(char[] nums, int n) {
        int j = n - 2;
        while (j >= 0 && (nums[j] - '0') > (nums[j+1] - '0')) --j;
        if (j < 0) {
            reverseArr(nums, 0, n - 1);
        } else {
            int i = n - 1;
            while ((nums[j] - '0') > (nums[i] - '0')) --i;
            swapNum(nums, j, i);
            reverseArr(nums, j + 1, n - 1);
        }
    }

    public String getPermutation(int n, int k) {
        char[] nums = new char[n];
        for (int i = 0; i < n; ++i) nums[i] = (char)('0' + (i + 1));
        while (--k != 0) nextPermutation(nums, n);
        return new String(nums);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}