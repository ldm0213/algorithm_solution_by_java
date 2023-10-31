package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 16:48:38
 * @link https://leetcode.com/problems/binary-tree-paths/
 */
public class T257BinaryTreePaths {

    public static void main(String[] args) {
        Solution solution = new T257BinaryTreePaths().new Solution();
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
    List<String> result = new ArrayList<>();
    String convertToStr(List<Integer> current) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < current.size(); ++i) {
            sb.append(current.get(i));
            if (i != current.size() - 1) sb.append("->");
        }
        return sb.toString();
    }

    void dfs(TreeNode root, List<Integer> current) {
        if (root == null) return ;
        current.add(root.val);
        if (root.left == null && root.right == null) {
            result.add(convertToStr(current));
        } else {
            dfs(root.left, current);
            dfs(root.right, current);
        }
        current.remove(current.size() - 1);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> current = new ArrayList<>();
        dfs(root, current);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}