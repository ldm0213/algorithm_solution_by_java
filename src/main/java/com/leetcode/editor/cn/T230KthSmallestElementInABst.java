package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 16:40:48
 * @link https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 */
public class T230KthSmallestElementInABst {

    public static void main(String[] args) {
        Solution solution = new T230KthSmallestElementInABst().new Solution();
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
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stk = new ArrayDeque<>();
        TreeNode current = root;
        while (current != null || !stk.isEmpty()) {
            while (current != null) {
                stk.push(current);
                current = current.left;
            }
            TreeNode t = stk.pop();
            if (k == 1) return t.val;
            k -= 1;
            current = t.right;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}