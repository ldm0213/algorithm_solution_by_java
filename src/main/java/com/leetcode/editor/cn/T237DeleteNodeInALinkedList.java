package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 15:55:27
 * @link https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class T237DeleteNodeInALinkedList {

    public static void main(String[] args) {
        Solution solution = new T237DeleteNodeInALinkedList().new Solution();
        // write test case
    }
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
   

	//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}