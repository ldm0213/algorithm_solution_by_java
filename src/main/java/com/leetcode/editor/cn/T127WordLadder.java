package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author  lidongmeng
 * @date 2023-11-21 09:56:30
 * @link https://leetcode.com/problems/word-ladder/
 */
public class T127WordLadder {

    public static void main(String[] args) {
        Solution solution = new T127WordLadder().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;
        Set<String> wordSet = new HashSet<>(wordList);
        Deque<String> q = new ArrayDeque<>();
        q.offer(beginWord);
        int step = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            ++step;
            for (int i = 0; i < len; ++i) {
                String t = q.poll();
                if (t.equals(endWord)) return step;
                char[] tArr = t.toCharArray();
                for (int j = 0; j < t.length(); ++j) {
                    char ch = tArr[j];
                    for (char k = 'a'; k <= 'z'; ++k) {
                        tArr[j] = k;
                        // 替换后的字符是否在wordSet中
                        String tmp = new String(tArr);
                        if (wordSet.contains(tmp) && !tmp.equals(t)) {
                            q.offer(tmp);
                            wordSet.remove(tmp);
                        }
                        tArr[j] = ch;
                    }
                 }
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}