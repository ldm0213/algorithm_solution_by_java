package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-05 10:32:28
 * @link https://leetcode.com/problems/pascals-triangle-ii/
 */
public class T119PascalsTriangleIi {

    public static void main(String[] args) {
        Solution solution = new T119PascalsTriangleIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRowV1(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        for (int i = 0; i <= rowIndex; ++i) {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    current.add(1);
                } else {
                    current.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = current;
        }
        return prev;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            result.add(0);
            // 倒着计算当前行，这样计算到第 i 项时，第 i−1 项仍然是上一行的值。
            for (int j = i; j > 0; --j) {
                result.set(j, result.get(j) + result.get(j-1));
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}