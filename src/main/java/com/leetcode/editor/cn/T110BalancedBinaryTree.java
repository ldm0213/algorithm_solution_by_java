package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 15:48:21
 * @link https://leetcode.com/problems/balanced-binary-tree/
 */
public class T110BalancedBinaryTree {

    public static void main(String[] args) {
        Solution solution = new T110BalancedBinaryTree().new Solution();
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
    int checkDepth(TreeNode root) {
        if (root == null) return 0;
        int left = checkDepth(root.left);
        if (left == -1) return -1;
        int right = checkDepth(root.right);
        if (right == -1) return -1;
        int diff = Math.abs(left - right);
        if (diff > 1) return -1;
        else return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        if (checkDepth(root) == -1) {
            return false;
        } else {
            return true;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}