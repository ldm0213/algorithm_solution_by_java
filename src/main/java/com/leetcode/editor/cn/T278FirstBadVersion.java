package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 11:32:04
 * @link https://leetcode.com/problems/first-bad-version/
 */
public class T278FirstBadVersion {

    public static void main(String[] args) {
        Solution solution = new T278FirstBadVersion().new Solution();
        // write test case
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}