package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-03 16:02:58
 * @link https://leetcode.com/problems/clone-graph/
 */
public class T133CloneGraph {

    public static void main(String[] args) {
        Solution solution = new T133CloneGraph().new Solution();
        // write test case
    }

     class Node {
         public int val;
         public List<Node> neighbors;
         public Node() {
             val = 0;
             neighbors = new ArrayList<>();
         }
         public Node(int _val) {
             val = _val;
             neighbors = new ArrayList<Node>();
         }
         public Node(int _val, ArrayList<Node> _neighbors) {
             val = _val;
             neighbors = _neighbors;
         }
     }

	//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}