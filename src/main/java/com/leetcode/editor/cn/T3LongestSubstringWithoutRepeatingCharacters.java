package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-01 15:18:28
 * @link https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class T3LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Solution solution = new T3LongestSubstringWithoutRepeatingCharacters().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mmap = new HashMap<>();
        int left = -1, result = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (mmap.getOrDefault(s.charAt(i), -1) > left)
                left = mmap.get(s.charAt(i));
            result = Math.max(result, i - left);
            mmap.put(s.charAt(i), i);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}