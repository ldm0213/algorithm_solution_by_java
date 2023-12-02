package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author  lidongmeng
 * @date 2023-11-28 09:53:25
 * @link https://leetcode.com/problems/check-completeness-of-a-binary-tree/
 */
public class T958CheckCompletenessOfABinaryTree {

    public static void main(String[] args) {
        Solution solution = new T958CheckCompletenessOfABinaryTree().new Solution();
        // write test case
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

 public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean reachEnd = false;
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            if (reachEnd && t != null) return false;
            if (t == null) {reachEnd = true; continue;}
            q.offer(t.left);
            q.offer(t.right);
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}