package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-21 20:21:32
 * @link https://leetcode.com/problems/isomorphic-strings/
 */
public class T205IsomorphicStrings {

    public static void main(String[] args) {
        Solution solution = new T205IsomorphicStrings().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> mmap1 = new HashMap<>();
        Map<Character, Character> mmap2 = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            if (mmap1.containsKey(s.charAt(i)) && mmap1.get(s.charAt(i)) != t.charAt(i)) return false;
            if (mmap2.containsKey(t.charAt(i)) && mmap2.get(t.charAt(i)) != s.charAt(i)) return false;
            mmap1.put(s.charAt(i), t.charAt(i));
            mmap2.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}