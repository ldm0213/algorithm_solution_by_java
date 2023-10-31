package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 15:32:10
 * @link https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */
public class T106ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public static void main(String[] args) {
        Solution solution = new T106ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
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
    TreeNode helper(int[] inorder, int s1, int e1, int[] postorder, int s2, int e2) {
        if (s1 > e1) return null;
        int target = postorder[e2];
        int index = findTarget(inorder, s1, e1, target);
        int len = index - s1;
        TreeNode root = new TreeNode(target);
        root.left = helper(inorder, s1, index - 1, postorder, s2, s2 + len - 1);
        root.right = helper(inorder, index + 1, e1, postorder, s2 + len, e2 - 1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}