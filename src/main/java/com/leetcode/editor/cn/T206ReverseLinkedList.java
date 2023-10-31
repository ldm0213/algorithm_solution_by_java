package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 15:44:04
 * @link https://leetcode.com/problems/reverse-linked-list/
 */
public class T206ReverseLinkedList {

    public static void main(String[] args) {
        Solution solution = new T206ReverseLinkedList().new Solution();
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
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode t = head;
            head = head.next;
            t.next = prev;
            prev = t;
        }
        return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}