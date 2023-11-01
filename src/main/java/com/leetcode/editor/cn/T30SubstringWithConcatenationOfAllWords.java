package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-01 15:22:13
 * @link https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 */
public class T30SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
        Solution solution = new T30SubstringWithConcatenationOfAllWords().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s.isEmpty() || words.length == 0) return result;
        int wordLen = words[0].length(), arrLen = words.length;
        Map<String, Integer> dict = new HashMap<>();
        for (String word: words) dict.put(word, dict.getOrDefault(word, 0) + 1);
        for (int i = 0; i <= s.length() - wordLen * arrLen; ++i) {
            Map<String, Integer> findMap = new HashMap<>();
            int j = 0;
            for (; j < arrLen; j++) {
                String t = s.substring(i + j * wordLen, i + (j + 1) * wordLen);
                if (!dict.containsKey(t)) break;
                findMap.put(t, findMap.getOrDefault(t, 0) + 1);
                if (findMap.get(t) > dict.get(t)) break;
            }
            if (j == arrLen) result.add(i);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}