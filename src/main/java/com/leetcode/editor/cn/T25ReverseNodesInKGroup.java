package com.leetcode.editor.cn;

import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-10-30 14:46:48
 * @link https://leetcode.com/problems/reverse-nodes-in-k-group/
 */
public class T25ReverseNodesInKGroup {

    public static void main(String[] args) {
        Solution solution = new T25ReverseNodesInKGroup().new Solution();
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

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode tmp = head;
            head = head.next;
            tmp.next = prev;
            prev = tmp;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        while (true) {
            int m = k - 1;
            while (m != 0 && current != null) {m--; current = current.next;}
            if (current == null) break;

            ListNode nextHead = current.next;
            current.next = null;
            prev.next = reverseList(prev.next);
            while (prev.next != null) prev = prev.next;
            prev.next = nextHead;
            current = nextHead;
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}