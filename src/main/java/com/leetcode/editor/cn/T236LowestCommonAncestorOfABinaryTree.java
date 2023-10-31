package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 17:07:56
 * @link https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class T236LowestCommonAncestorOfABinaryTree {

    public static void main(String[] args) {
        Solution solution = new T236LowestCommonAncestorOfABinaryTree().new Solution();
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
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //1. 如果root已经到达了NULL，则说明已经到达了结尾，没有找到最近公共祖先；
        //2. 如果root和p或者q相同，则表明此节点已经是最近公共祖先了
        if (root == null || root == p || root == q) return root;

        //1. 如果在root的左子树中找到了两个的最近公共祖先，说明p和q都在root的左子树，返回即可
        //2. 如果在root的右子树找到了两个的最近公共祖先，说明p和q都在root的右子树，返回即可
        //3. 如果左右子树都能找到两个的最近公共祖先，说明p和q在root的两侧，返回root
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if (l == null) return r;
        if (r == null) return l;
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}