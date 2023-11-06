package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-01 17:12:01
 * @link https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
public class T17LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        Solution solution = new T17LetterCombinationsOfAPhoneNumber().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<String> result = new ArrayList<>();
    List<String> dict = Arrays.asList(
            "", "", "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz");

    void dfs(String digits, int index, String current) {
        if (index == digits.length()) {
            result.add(current);
        } else {
            String t = dict.get(digits.charAt(index) - '0');
            for (int i = 0; i < t.length(); ++i) {
                dfs(digits, index + 1, current + t.charAt(i));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return result;
        dfs(digits, 0, "");
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}