package com.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author  lidongmeng
 * @date 2023-11-21 20:26:49
 * @link https://leetcode.com/problems/contains-duplicate/
 */
public class T217ContainsDuplicate {

    public static void main(String[] args) {
        Solution solution = new T217ContainsDuplicate().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mset = new HashSet<>();
        for (int num: nums) {
            if (mset.contains(num)) return true;
            mset.add(num);
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}