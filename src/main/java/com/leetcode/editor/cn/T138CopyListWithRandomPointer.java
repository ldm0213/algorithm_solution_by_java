package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 11:21:04
 * @link https://leetcode.com/problems/copy-list-with-random-pointer/
 */
public class T138CopyListWithRandomPointer {

    public static void main(String[] args) {
        Solution solution = new T138CopyListWithRandomPointer().new Solution();
        // write test case
    }

    class Node {
         int val;
         Node next;
         Node random;

         public Node(int val) {
             this.val = val;
             this.next = null;
             this.random = null;
         }
     }
   

	//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return head;
        Node current = head;
        // 复制节点
        while (current != null) {
            Node newNode = new Node(current.val);
            Node next = current.next;
            current.next = newNode;
            newNode.next = next;
            current = current.next.next;
        }
        // 建立random关系
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        // 拆出来
        current = head;
        Node newHead = current.next;
        while (current != null) {
            Node newNode = current.next;
            current.next = current.next.next;
            current = current.next;
            if (current != null) newNode.next = current.next;
        }
        return newHead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}