package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 16:30:03
 * @link https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class T129SumRootToLeafNumbers {

    public static void main(String[] args) {
        Solution solution = new T129SumRootToLeafNumbers().new Solution();
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
    int result = 0;
    void dfs(TreeNode root, int sum) {
        if (root == null) return ;
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            result += sum;
        } else {
            dfs(root.left, sum);
            dfs(root.right, sum);
        }
    }

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}