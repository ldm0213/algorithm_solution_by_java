package com.leetcode.editor.cn;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-11-06 10:59:31
 * @link https://leetcode.com/problems/house-robber-iii/
 */
public class T337HouseRobberIii {

    public static void main(String[] args) {
        Solution solution = new T337HouseRobberIii().new Solution();
        // write test case
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

	//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int[] dfs(TreeNode root) {
        // int[]  0:选当前节点得到的最大值，1不选当前节点得到的最大值
        if (root == null) return new int[]{0, 0};
        int[] l = dfs(root.left);
        int[] r = dfs(root.right);
        return new int[]{
                root.val + l[1] + r[1],
                Math.max(l[0], l[1]) + Math.max(r[0], r[1])
        };
    }
    public int rob(TreeNode root) {
        int[] result = dfs(root);
        return Math.max(result[0], result[1]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}