package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author  lidongmeng
 * @date 2023-11-07 11:19:57
 * @link https://leetcode.com/problems/simplify-path/
 */
public class T71SimplifyPath {

    public static void main(String[] args) {
        Solution solution = new T71SimplifyPath().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        Deque<String> q = new ArrayDeque<>();
        int index = 0, len = path.length();
        while (index < len) {
            while (index < len && path.charAt(index) == '/') ++index;
            int l = index;
            while (index < len && path.charAt(index) != '/') ++index;
            String t = path.substring(l, index);
            if (t.equals("..")) {
                if (!q.isEmpty()) q.pollLast();
            } else if (!(t.equals("") || t.equals("."))) {
                q.offer(t);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            sb.append("/").append(q.poll());
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}