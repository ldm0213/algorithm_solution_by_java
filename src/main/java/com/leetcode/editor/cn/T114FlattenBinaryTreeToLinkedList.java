package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 10:28:23
 * @link https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */
public class T114FlattenBinaryTreeToLinkedList {

    public static void main(String[] args) {
        Solution solution = new T114FlattenBinaryTreeToLinkedList().new Solution();
        // write test case
    }
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    public void flatten(TreeNode root) {
        if (root == null) return ;
        if (root.left != null) {
            TreeNode r = root.right;
            root.right = root.left;
            root.left = null;
            TreeNode current = root;
            while (current.right != null) {current = current.right;}
            current.right = r;
        }

        flatten(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}