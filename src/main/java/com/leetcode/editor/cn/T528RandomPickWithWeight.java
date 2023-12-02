package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-28 15:11:58
 * @link https://leetcode.com/problems/random-pick-with-weight/
 */
public class T528RandomPickWithWeight {

    public static void main(String[] args) {
        Solution solution = new T528RandomPickWithWeight().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 由于我们的rand()函数是等概率的随机，那么我们如何才能有权重的随机呢，
    // 由于权重是1和3，相加为4，那么我们现在假设有4个点，然后随机等概率取一个点，
    // 随机到第一个点后就表示原来的第一个点，随机到后三个点就表示原来的第二个点，这样就可以保证有权重的随机啦。
    // 那么我们就可以建立权重数组的累加和数组，比如若权重数组为 [1, 3, 2] 的话，那么累加和数组为 [1, 4, 6]，
    // 整个的权重和为6，我们 rand() % 6，可以随机出范围 [0, 5] 内的数，随机到 0 则为第一个点，
    // 随机到 1，2，3 则为第二个点，随机到 4，5 则为第三个点，所以我们随机出一个数字x后，
    // 然后再累加和数组中查找第一个大于随机数x的数字，使用二分查找法可以找到第一个大于随机数x的数字的坐标，
    int[] prefix;
    int total;

    public Solution(int[] w) {
        prefix = new int[w.length];
        for (int i = 0; i < w.length; ++i) {
            prefix[i] = (i > 0 ? prefix[i-1] : 0) + w[i];
            total += w[i];
        }
    }
    
    public int pickIndex() {
        int l = 0, r = prefix.length;
        int target = (int)(Math.random() * total) + 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (prefix[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
//leetcode submit region end(Prohibit modification and deletion)

}