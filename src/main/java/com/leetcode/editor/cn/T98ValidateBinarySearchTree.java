package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 14:50:44
 * @link https://leetcode.com/problems/validate-binary-search-tree/
 */
public class T98ValidateBinarySearchTree {

    public static void main(String[] args) {
        Solution solution = new T98ValidateBinarySearchTree().new Solution();
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
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stk = new ArrayDeque<>();
        TreeNode current = root;
        TreeNode prev = null;
        while (!stk.isEmpty() || current != null) {
            while (current != null) {
                stk.push(current);
                current = current.left;
            }
            TreeNode t = stk.pop();
            if (prev != null && prev.val >= t.val) return false;
            prev = t;
            current = t.right;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}