package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-01 15:55:21
 * @link https://leetcode.com/problems/minimum-window-substring/
 */
public class T76MinimumWindowSubstring {

    public static void main(String[] args) {
        Solution solution = new T76MinimumWindowSubstring().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minWindow(String s, String t) {
        int start = 0, minWindow = Integer.MAX_VALUE, matchNum = 0, l = 0;
        Map<Character, Integer> mmap = new HashMap<>();
        Map<Character, Integer> findMap = new HashMap<>();
        for (Character ch: t.toCharArray()) mmap.put(ch, mmap.getOrDefault(ch, 0) + 1);
        for (int i = 0; i < s.length(); ++i) {
            findMap.put(s.charAt(i), findMap.getOrDefault(s.charAt(i), 0) + 1);
            if (mmap.containsKey(s.charAt(i)) && mmap.get(s.charAt(i)) == findMap.get(s.charAt(i))) matchNum++;

            //  找到符合条件的一个窗口，缩小窗口,直到不合适
            while (l <= i && matchNum == mmap.size()) {
                if (minWindow > i - l + 1) {
                    minWindow = i - l + 1;
                    start = l;
                }
                findMap.put(s.charAt(l), findMap.get(s.charAt(l)) - 1);
                if (mmap.containsKey(s.charAt(l)) && findMap.get(s.charAt(l)) < mmap.get(s.charAt(l))) {
                    matchNum--;
                }
                l++;
            }
        }
        return minWindow == Integer.MAX_VALUE ? "" : s.substring(start, start + minWindow);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}