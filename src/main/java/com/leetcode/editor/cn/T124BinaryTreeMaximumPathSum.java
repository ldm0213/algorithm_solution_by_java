package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 16:17:12
 * @link https://leetcode.com/problems/binary-tree-maximum-path-sum/
 */
public class T124BinaryTreeMaximumPathSum {

    public static void main(String[] args) {
        Solution solution = new T124BinaryTreeMaximumPathSum().new Solution();
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
    int result = Integer.MIN_VALUE;
    int helper(TreeNode root) {
        if (root == null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        int sum = Math.max(root.val, Math.max(l + root.val, r + root.val));
        result = Math.max(result, Math.max(sum, l + r + root.val));
        return sum;
    }

    public int maxPathSum(TreeNode root) {
        helper(root);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}