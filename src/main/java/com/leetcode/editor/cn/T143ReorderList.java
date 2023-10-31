package com.leetcode.editor.cn;

import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-10-31 11:07:19
 * @link https://leetcode.com/problems/reorder-list/
 */
public class T143ReorderList {

    public static void main(String[] args) {
        Solution solution = new T143ReorderList().new Solution();
        // write test case
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);
        solution.reorderList(head);
    }
    
    public static class ListNode {
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
    ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode tmp = head;
            head = head.next;
            tmp.next = prev;
            prev = tmp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return ;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        newHead = reverseList(newHead);
        ListNode current = head;
        while (current != null && newHead != null) {
            ListNode t = current.next;
            ListNode tmp = newHead.next;
            current.next = newHead;
            current.next.next = t;
            newHead = tmp;
            current = t;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}