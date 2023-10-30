package com.leetcode.editor.cn;

import javax.swing.tree.TreeNode;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-30 10:31:33
 * @link https://leetcode.com/problems/count-complete-tree-nodes/
 */
public class T222CountCompleteTreeNodes {

    public static void main(String[] args) {
        Solution solution = new T222CountCompleteTreeNodes().new Solution();
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
class Solution {
    int getHeight(TreeNode root) {
        int h = 0;
        while (root != null) {
            h += 1;
            root = root.left;
        }
        return h;
    }

    boolean valid(TreeNode root, int mid, int h) {
        int bit = 1 << (h - 2);
        while (bit > 0) {
            if ((bit & mid) == 0) {
                root = root.left;
            } else {
                root = root.right;
            }
            bit >>= 1;
        }
        return root != null;
    }

    public int countNodes(TreeNode root) {
        int h = getHeight(root);
        if (h <= 1) return h;
        int l = 1 << (h - 1);
        int r = 1 << h;
        int result = l;
        // 左闭右开
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (valid(root, mid, h)) {
                result = mid;
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}