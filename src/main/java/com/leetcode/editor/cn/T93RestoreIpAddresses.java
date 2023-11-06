package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-01 20:28:22
 * @link https://leetcode.com/problems/restore-ip-addresses/
 */
public class T93RestoreIpAddresses {

    public static void main(String[] args) {
        Solution solution = new T93RestoreIpAddresses().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    void backtrack(String s, int pos, List<String> current, List<String> result) {
        if (pos == s.length() && current.size() == 4) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < current.size(); ++i) {
                sb.append(current.get(i));
                if (i != current.size() - 1) sb.append(".");
            }
            result.add(sb.toString());
        } else {
            for (int i = pos; i < s.length(); ++i) {
                String t = s.substring(pos, i + 1);
                if (i != pos && t.charAt(0) == '0') break;

                int num = Integer.valueOf(t);
                if (num >= 0 && num <= 255) {
                    current.add(t);
                    backtrack(s, i + 1, current, result);
                    current.remove(current.size() - 1);
                } else {
                    break;
                }
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        backtrack(s, 0, current, result);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}