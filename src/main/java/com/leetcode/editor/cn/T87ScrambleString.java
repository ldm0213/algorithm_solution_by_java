package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-06 14:15:50
 * @link https://leetcode.com/problems/scramble-string/
 */
public class T87ScrambleString {

    public static void main(String[] args) {
        Solution solution = new T87ScrambleString().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    Map<String, Map<String, Boolean>> mmap = new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;
        int[] tables = new int[26];
        for (int i = 0; i < s1.length(); ++i) {
            tables[s1.charAt(i) - 'a']++;
            tables[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; ++i) {
            if (tables[i] != 0) return false;
        }

        if (mmap.containsKey(s1) && mmap.get(s1).containsKey(s2)) return mmap.get(s1).get(s2);

        for (int i = 1; i < s1.length(); ++i) {
            if ((isScramble(s1.substring(0, i), s2.substring(0, i))
                    && isScramble(s1.substring(i), s2.substring(i)))
                    || (isScramble(s1.substring(0, i), s2.substring(s2.length() - i))
                        && isScramble(s1.substring(i), s2.substring(0, s2.length() - i)))) {
                if (!mmap.containsKey(s1)) mmap.put(s1, new HashMap<>());
                mmap.get(s1).put(s2, true);
                return true;
            }
        }
        if (!mmap.containsKey(s1)) mmap.put(s1, new HashMap<>());
        mmap.get(s1).put(s2, false);
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}