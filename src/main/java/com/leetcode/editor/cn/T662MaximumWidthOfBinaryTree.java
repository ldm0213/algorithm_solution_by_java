package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Queue;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-11-29 10:57:49
 * @link https://leetcode.com/problems/maximum-width-of-binary-tree/
 */
public class T662MaximumWidthOfBinaryTree {

    public static void main(String[] args) {
        Solution solution = new T662MaximumWidthOfBinaryTree().new Solution();
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

class Pair {
     TreeNode node;
     int value;

     Pair(TreeNode node, int value) {
         this.node = node;
         this.value = value;
     }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(root, 1));
        int result = 0;
        while (!q.isEmpty()) {
            int left = q.peek().value, right = q.peek().value;
            int len = q.size();
            for (int i = 0; i < len; ++i) {
                Pair t = q.poll();
                right = t.value;
                if (t.node.left != null) q.offer(new Pair(t.node.left, t.value * 2));
                if (t.node.right != null) q.offer(new Pair(t.node.right, t.value * 2 + 1));
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}