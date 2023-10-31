package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 16:00:58
 * @link https://leetcode.com/problems/path-sum-ii/
 */
public class T113PathSumIi {

    public static void main(String[] args) {
        Solution solution = new T113PathSumIi().new Solution();
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
    void dfs(TreeNode root, int targetSum, List<Integer> current, List<List<Integer>> result) {
        if (root == null) return ;
        current.add(root.val);
        targetSum = targetSum - root.val;

        if (root.left == null && root.right == null && targetSum == 0) {
            result.add(new ArrayList<>(current));
        } else {
            dfs(root.left, targetSum, current, result);
            dfs(root.right, targetSum, current, result);
        }
        current.remove(current.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(root, targetSum, current, result);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}