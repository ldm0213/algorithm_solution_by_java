package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * @author  lidongmeng
 * @date 2023-10-31 10:48:22
 * @link https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
 */
public class T116PopulatingNextRightPointersInEachNode {

    public static void main(String[] args) {
        Solution solution = new T116PopulatingNextRightPointersInEachNode().new Solution();
        // write test case
    }

     class Node {
         public int val;
         public Node left;
         public Node right;
         public Node next;

         public Node() {}

         public Node(int _val) {
             val = _val;
         }

         public Node(int _val, Node _left, Node _right, Node _next) {
             val = _val;
             left = _left;
             right = _right;
             next = _next;
         }
     };
   

	//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int len = q.size();
            Node prev = null;
            for (int i = 0; i < len; ++i) {
                Node t = q.poll();
                if (prev == null) { prev = t; }
                else { prev.next = t; prev = prev.next; }
                if (t.left != null) { q.offer(t.left); }
                if (t.right != null) { q.offer(t.right); }
            }
        }
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}