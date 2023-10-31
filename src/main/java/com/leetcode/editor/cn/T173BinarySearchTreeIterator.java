package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 17:21:42
 * @link https://leetcode.com/problems/binary-search-tree-iterator/
 */
public class T173BinarySearchTreeIterator {

    public static void main(String[] args) {
        Solution solution = new T173BinarySearchTreeIterator().new Solution();
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
class BSTIterator {
    Deque<TreeNode> stk = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        while (root != null) {
            stk.push(root);
            root = root.left;
        }
    }
    
    public int next() {
        TreeNode t = stk.pop();
        TreeNode current = t.right;
        while (current != null) {
            stk.push(current);
            current = current.left;
        }
        return t.val;
    }
    
    public boolean hasNext() {
        return !stk.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
//leetcode submit region end(Prohibit modification and deletion)

}