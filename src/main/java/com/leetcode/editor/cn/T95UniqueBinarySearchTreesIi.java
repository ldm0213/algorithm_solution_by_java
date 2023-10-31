package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 14:42:38
 * @link https://leetcode.com/problems/unique-binary-search-trees-ii/
 */
public class T95UniqueBinarySearchTreesIi {

    public static void main(String[] args) {
        Solution solution = new T95UniqueBinarySearchTreesIi().new Solution();
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
    List<TreeNode> generator(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);
            return result;
        }
        for (int k = start; k <= end; ++k) {
            List<TreeNode> l = generator(start, k - 1);
            List<TreeNode> r = generator(k + 1, end);
            for (int i = 0; i < l.size(); ++i) {
                for (int j = 0; j < r.size(); ++j) {
                    TreeNode root = new TreeNode(k);
                    root.left = l.get(i);
                    root.right = r.get(j);
                    result.add(root);
                }
            }
        }
        return result;
    }
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return generator(1, n);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}