package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 15:20:35
 * @link https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class T105ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public static void main(String[] args) {
        Solution solution = new T105ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
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
    int findTarget(int[] nums, int start, int end, int target) {
        for (int i = start; i <= end; ++i) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
    TreeNode helper(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2) {
        if (s1 > e1) return null;
        int target = preorder[s1];
        int index = findTarget(inorder, s2, e2, target);
        int len = index - s2;
        TreeNode root = new TreeNode(target);
        root.left = helper(preorder, s1 + 1, s1 + 1 + len - 1, inorder, s2, index - 1);
        root.right = helper(preorder, s1 + 1 + len, e1, inorder, index + 1, e2);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}