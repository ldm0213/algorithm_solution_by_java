package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 14:31:19
 * @link https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class T19RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        Solution solution = new T19RemoveNthNodeFromEndOfList().new Solution();
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = head;
        while (n != 0) {fast = fast.next; n--;}
        ListNode prev = dummy;
        while (fast != null) {
            fast = fast.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}