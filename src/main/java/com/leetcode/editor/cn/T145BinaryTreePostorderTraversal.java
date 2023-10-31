package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 16:32:31
 * @link https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class T145BinaryTreePostorderTraversal {

    public static void main(String[] args) {
        Solution solution = new T145BinaryTreePostorderTraversal().new Solution();
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode current = root, prev = null;
        Deque<TreeNode> stk = new ArrayDeque<>();
        while (!stk.isEmpty() || current != null) {
            while (current != null) {
                stk.push(current);
                current = current.left;
            }
            TreeNode t = stk.pop();
            if (t.right == null || (prev != null && prev == t.right)) {
                result.add(t.val);
                prev = t;
            } else {
                stk.push(t);
                current = t.right;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}