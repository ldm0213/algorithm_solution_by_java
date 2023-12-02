package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-11-21 21:17:17
 * @link https://leetcode.com/problems/valid-anagram/
 */
public class T242ValidAnagram {

    public static void main(String[] args) {
        Solution solution = new T242ValidAnagram().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] tables = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            tables[s.charAt(i) - 'a']++;
            tables[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; ++i) if (tables[i] != 0) return false;
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}