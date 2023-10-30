package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 11:10:32
 * @link https://leetcode.com/problems/find-the-duplicate-number/
 */
public class T287FindTheDuplicateNumber {

    public static void main(String[] args) {
        Solution solution = new T287FindTheDuplicateNumber().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findDuplicateV1(int[] nums) {
        int l = 1, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int count = 0;
            // 遍历整个数组，统计所有小于等于 mid 的数的个数，如果个数小于等于 mid，则说明重复值在 [mid+1, n] 之间，
            // 反之，重复值应在 [1, mid-1] 之间，然后依次类推，直到搜索完成，此时的 low 就是我们要求的重复值
            for (int i = 0; i < nums.length; ++i) count += (nums[i] <= mid) ? 1 : 0;
            if (count > mid) r = mid;
            else l = mid + 1;
        }
        return l;
    }

    public int findDuplicate(int[] nums) {
        // 对于每一位，0到 n-1 中所有数字中该位上的1的个数应该是固定的，如果 nums 数组中所有数字中该位上1的个数多了，
        // 说明重复数字在该位上一定是1，这样我们把重复数字的所有为1的位都累加起来，就可以还原出了这个重复数字
        int n = nums.length, result = 0;
        for (int i = 0; i < 32; ++i) {
            int bit = (1 << i), cnt1 = 0, cnt2 = 0;
            for (int j = 0; j < n; ++j) {
                if ((bit & j) > 0) ++cnt1;
                if ((bit & nums[j]) > 0) ++cnt2;
            }
            if (cnt1 < cnt2) result += bit;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}