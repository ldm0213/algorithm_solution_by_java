package com.leetcode.editor.cn;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 15:14:40
 * @link https://leetcode.com/problems/symmetric-tree/
 */
public class T101SymmetricTree {

    public static void main(String[] args) {
        Solution solution = new T101SymmetricTree().new Solution();
        // write test case
    }
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
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
    boolean valid(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;
        return l.val == r.val && valid(l.left, r.right) && valid(l.right, r.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return valid(root.left, root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}