package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 16:28:03
 * @link https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class T144BinaryTreePreorderTraversal {

    public static void main(String[] args) {
        Solution solution = new T144BinaryTreePreorderTraversal().new Solution();
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stk = new ArrayDeque<>();
        TreeNode current = root;
        while (current != null || !stk.isEmpty()) {
            while (current != null) {
                result.add(current.val);
                stk.push(current);
                current = current.left;
            }
            TreeNode t = stk.pop();
            current = t.right;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}