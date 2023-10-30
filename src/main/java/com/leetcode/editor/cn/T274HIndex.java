package com.leetcode.editor.cn;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author  lidongmeng
 * @date 2023-10-30 14:05:03
 * @link https://leetcode.com/problems/h-index/
 */
public class T274HIndex {

    public static void main(String[] args) {
        Solution solution = new T274HIndex().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hIndex(int[] citations) {
        // 将其发表的所有SCI论文[来源请求]按被引次数从高到低排序
        citations = Arrays.stream(citations).boxed()
                .sorted((a, b) -> b - a).mapToInt(p -> p).toArray();
        int result = 0;
        for (int i = 0; i < citations.length; ++i) {
            // 从前往后查找排序后的列表，只要当前的引用量大于当前的索引值，则H指数加1，最后得到的结果即为最终的H指数。
            if (citations[i] > i) result++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}