package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 16:58:26
 * @link https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class T235LowestCommonAncestorOfABinarySearchTree {

    public static void main(String[] args) {
        Solution solution = new T235LowestCommonAncestorOfABinarySearchTree().new Solution();
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
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}