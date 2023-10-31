package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import com.sun.source.tree.Tree;

/**
 * @author  lidongmeng
 * @date 2023-10-31 17:27:51
 * @link https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 */
public class T297SerializeAndDeserializeBinaryTree {

    public static void main(String[] args) {
        Solution solution = new T297SerializeAndDeserializeBinaryTree().new Solution();
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
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "#";
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; ++i) {
                TreeNode t = q.poll();
                if (t == null) {
                    sb.append("#");
                    sb.append(";");
                } else {
                    sb.append(t.val);
                    sb.append(";");
                    q.offer(t.left);
                    q.offer(t.right);
                }
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (Objects.equals(data, "#")) return null;
        String[] arr = data.split(";");
        int index = 0;
        TreeNode root = new TreeNode(Integer.parseInt(arr[index++]));
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; ++i) {
                TreeNode t = q.poll();
                if (Objects.equals(arr[index], "#")) t.left = null;
                else {t.left = new TreeNode(Integer.parseInt(arr[index])); q.offer(t.left);}
                index++;
                if (Objects.equals(arr[index], "#")) t.right = null;
                else {t.right = new TreeNode(Integer.parseInt(arr[index])); q.offer(t.right);}
                index++;
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)

}