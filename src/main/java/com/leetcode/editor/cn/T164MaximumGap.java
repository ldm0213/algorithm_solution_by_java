package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @author  lidongmeng
 * @date 2023-11-09 14:59:21
 * @link https://leetcode.com/problems/maximum-gap/
 */
public class T164MaximumGap {

    public static void main(String[] args) {
        Solution solution = new T164MaximumGap().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length <= 1) return 0;
        // 桶排序
        // 首先计算最大最小值
        int mx = Integer.MIN_VALUE, mi = Integer.MAX_VALUE, len = nums.length, prev = 0;
        for (int num: nums) {
            mx = Math.max(mx, num);
            mi = Math.min(mi, num);
        }
        // 然后确定每个桶的容量 (最大值 - 最小值) / 个数 + 1
        int size = (mx - mi) / len + 1;
        // 分桶数目 (最大值 - 最小值) / 桶的容量 + 1
        int cnt = (mx - mi) / size + 1;
        int[] maxBucket = new int[cnt];
        int[] minBucket = new int[cnt];
        Arrays.fill(maxBucket, Integer.MIN_VALUE);
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        //  在每个桶中找出局部最大值和最小值
        for (int i = 0; i < len; ++i) {
            // 处于哪一个桶
            int bucketIndex = (nums[i] - mi) / size;
            maxBucket[bucketIndex] = Math.max(maxBucket[bucketIndex], nums[i]);
            minBucket[bucketIndex] = Math.min(minBucket[bucketIndex], nums[i]);
        }
        // 最大间距的两个数不会在同一个桶中，而是一个桶的最小值和另一个桶的最大值之间的间距，
        // 这是因为所有的数字要尽量平均分配到每个桶中，而不是都拥挤在一个桶中，
        // 这样保证了最大值和最小值一定不会在同一个桶中
        int result = 0;
        for (int i = 1; i < cnt; ++i) {
            if (maxBucket[i] == Integer.MIN_VALUE || minBucket[i] == Integer.MAX_VALUE) continue;
            result = Math.max(result, minBucket[i] - maxBucket[prev]);
            prev = i;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}