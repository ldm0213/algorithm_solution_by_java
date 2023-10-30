package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-28 16:41:07
 * @link https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class T167TwoSumIiInputArrayIsSorted {

    public static void main(String[] args) {
        Solution solution = new T167TwoSumIiInputArrayIsSorted().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int findTarget(int[] numbers, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (numbers[mid] == target) return mid;
            else if (numbers[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public int[] twoSumV1(int[] numbers, int target) {
        // O(nlgn)
        for (int i = 0; i < numbers.length; ++i) {
            int index = findTarget(numbers, i + 1, numbers.length - 1, target - numbers[i]);
            if (index != -1) {
                return new int[]{i + 1, index + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) return new int[]{l + 1, r + 1};
            else if (sum < target) l += 1;
            else r -= 1;
        }
        return new int[]{-1, -1};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}