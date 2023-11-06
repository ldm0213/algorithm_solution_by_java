package com.leetcode.editor.cn;

import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-05 10:41:43
 * @link https://leetcode.com/problems/triangle/
 */
public class T120Triangle {

    public static void main(String[] args) {
        Solution solution = new T120Triangle().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size(), result = Integer.MAX_VALUE;
        if (m == 1) return triangle.get(0).get(0);
        for (int i = 1; i < m; ++i) {
            for (int j = triangle.get(i).size() - 1; j >= 0; j--) {
                int current = triangle.get(i).get(j);
                if (j == triangle.get(i).size() - 1) {
                    triangle.get(i).set(j, current + triangle.get(i-1).get(j-1));
                } else if (j == 0) {
                    triangle.get(i).set(j, current + triangle.get(i-1).get(j));
                } else {
                    int tmp = current + Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1));
                    triangle.get(i).set(j, tmp);
                }

                if (i == m-1) {
                    result = Math.min(result, triangle.get(i).get(j));
                }
            }
        }
        return  result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}