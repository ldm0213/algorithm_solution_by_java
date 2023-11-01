package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-01 16:15:42
 * @link https://leetcode.com/problems/repeated-dna-sequences/
 */
public class T187RepeatedDnaSequences {

    public static void main(String[] args) {
        Solution solution = new T187RepeatedDnaSequences().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> mmap = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; ++i) {
            String t = s.substring(i, i + 10);
            mmap.put(t, mmap.getOrDefault(t, 0) + 1);
            if (mmap.get(t) == 2) result.add(t);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}