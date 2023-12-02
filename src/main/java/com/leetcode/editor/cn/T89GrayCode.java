package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-09 14:42:25
 * @link https://leetcode.com/problems/gray-code/
 */
public class T89GrayCode {

    public static void main(String[] args) {
        Solution solution = new T89GrayCode().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0); result.add(1);
        for (int i = 2; i <= n; ++i) {
            int prevLen = result.size();
            for (int j = prevLen - 1; j >= 0; --j) {
                result.add((1 << (i -1)) + result.get(j));
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}