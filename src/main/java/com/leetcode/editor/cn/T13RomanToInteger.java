package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  lidongmeng
 * @date 2023-11-07 10:08:24
 * @link https://leetcode.com/problems/roman-to-integer/
 */
public class T13RomanToInteger {

    public static void main(String[] args) {
        Solution solution = new T13RomanToInteger().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mmap = new HashMap<>();
        mmap.put('I', 1);
        mmap.put('V', 5);
        mmap.put('X', 10);
        mmap.put('L', 50);
        mmap.put('C', 100);
        mmap.put('D', 500);
        mmap.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            result += mmap.get(s.charAt(i));
            if (i != 0 && mmap.get(s.charAt(i-1)) < mmap.get(s.charAt(i))) {
                result -= 2 * mmap.get(s.charAt(i-1));
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}