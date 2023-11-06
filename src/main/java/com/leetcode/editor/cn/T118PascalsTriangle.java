package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-05 10:14:25
 * @link https://leetcode.com/problems/pascals-triangle/
 */
public class T118PascalsTriangle {

    public static void main(String[] args) {
        Solution solution = new T118PascalsTriangle().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        for (int i = 2; i <= numRows; ++i) {
            List<Integer> prev = result.get(i-2);
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 1; j < prev.size(); ++j) {
                current.add(prev.get(j - 1) + prev.get(j));
            }
            current.add(1);
            result.add(current);
        }
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}