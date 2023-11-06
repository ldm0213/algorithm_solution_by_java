package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-03 14:06:33
 * @link https://leetcode.com/problems/expression-add-operators/
 */
public class T282ExpressionAddOperators {

    public static void main(String[] args) {
        Solution solution = new T282ExpressionAddOperators().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void backtrack(List<String> result, String current, String num, long target, int pos, long sum, long prev) {
        if (pos == num.length() && target == sum) {
            result.add(current);
        } else {
            long t = 0;
            for (int i = pos; i < num.length(); ++i) {
                t = t * 10 + (num.charAt(i) - '0');
                if (i != pos && num.charAt(pos) == '0') break;
                if (pos == 0) {
                    backtrack(result, current + t, num, target, i + 1, sum + t, t);
                } else {
                    backtrack(result, current + "+" + t, num, target, i + 1, sum + t, t);
                    backtrack(result, current + "-" + t, num, target, i + 1, sum - t, -1 * t);
                    backtrack(result, current + "*" + t, num, target, i + 1,(sum - prev) + prev * t, prev * t);
                }
            }
        }
    }

    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", num, target, 0, 0, 0);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}