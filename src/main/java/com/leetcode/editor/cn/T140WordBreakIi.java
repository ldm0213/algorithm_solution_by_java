package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author  lidongmeng
 * @date 2023-11-05 17:00:36
 * @link https://leetcode.com/problems/word-break-ii/
 */
public class T140WordBreakIi {

    public static void main(String[] args) {
        Solution solution = new T140WordBreakIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 回溯
    void dfs(List<String> result, String s, int pos, Set<String> wordSet, String current) {
        if (pos == s.length()) {
            result.add(current.trim());
        } else {
            for (int i = pos; i < s.length(); ++i) {
                String t = s.substring(pos, i + 1);
                if (wordSet.contains(t)) {
                    dfs(result, s, i+1, wordSet, current + " " + t);
                }
            }
        }
    }

    public List<String> wordBreakV1(String s, List<String> wordDict) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(wordDict);
        dfs(result, s, 0, wordSet, "");
        return result;
    }


    // 记忆化搜索

    List<List<String>> dfs(Map<Integer, List<List<String>>> mmap, String s, int pos, Set<String> wordSet) {
        if (!mmap.containsKey(pos)) {
            List<List<String>> result = new ArrayList<>();
            if (pos == s.length()) {
                result.add(new ArrayList<>());
            } else {
                for (int i = pos; i < s.length(); ++i) {
                    String t = s.substring(pos, i + 1);
                    if (wordSet.contains(t)) {
                        List<List<String>> nextResult = dfs(mmap, s, i+1, wordSet);
                        for (int j = 0; j < nextResult.size(); ++j) {
                            List<String> current = new ArrayList<>(nextResult.get(j));
                            current.add(0, t);
                            result.add(current);
                        }
                    }
                }
            }
            mmap.put(pos, result);
        }
        return mmap.get(pos);
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<List<String>>> mmap = new HashMap<>();
        Set<String> wordSet = new HashSet<>(wordDict);
        List<List<String>> data = dfs(mmap, s, 0, wordSet);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < data.size(); ++i) {
            result.add(String.join(" ", data.get(i)));
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}