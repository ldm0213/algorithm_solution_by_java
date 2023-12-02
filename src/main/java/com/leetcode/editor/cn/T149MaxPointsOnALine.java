package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author  lidongmeng
 * @date 2023-11-20 17:28:27
 * @link https://leetcode.com/problems/max-points-on-a-line/
 */
public class T149MaxPointsOnALine {

    public static void main(String[] args) {
        Solution solution = new T149MaxPointsOnALine().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public int maxPoints(int[][] points) {
        int result = 1;
        for (int i = 0; i < points.length; ++i) {
            Map<String, Integer> mmap = new HashMap<>();
            int mx = 0;
            for (int j = i + 1; j < points.length; ++j) {
                int diffX = points[j][0] - points[i][0];
                int diffY = points[j][1] - points[i][1];
                int k = gcd(diffX, diffY);
                String key = (diffX / k) + "_" + (diffY / k);
                mmap.put(key, mmap.getOrDefault(key, 0) + 1);
                mx = Math.max(mx, mmap.get(key));
            }
            result = Math.max(result, mx + 1);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}