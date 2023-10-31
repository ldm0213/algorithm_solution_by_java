package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-10-31 14:57:47
 * @link https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class T103BinaryTreeZigzagLevelOrderTraversal {

    public static void main(String[] args) {
        Solution solution = new T103BinaryTreeZigzagLevelOrderTraversal().new Solution();
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean flag = true;

        while (!q.isEmpty()) {
            int len = q.size();
            List<Integer> current = new ArrayList<>();
            for (int i = 0; i < len; ++i) {
                TreeNode t = q.poll();
                current.add(t.val);
                if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
            }
            if (!flag) {
                Collections.reverse(current);
            }
            result.add(current);
            flag = !flag;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}