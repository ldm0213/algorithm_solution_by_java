package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 16:12:13
 * @link https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class T111MinimumDepthOfBinaryTree {

    public static void main(String[] args) {
        Solution solution = new T111MinimumDepthOfBinaryTree().new Solution();
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        return root.left == null || root.right == null ? l + r + 1 : Math.min(l, r) + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}