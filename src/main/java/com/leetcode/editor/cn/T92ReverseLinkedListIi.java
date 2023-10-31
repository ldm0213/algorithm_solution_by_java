package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 15:37:50
 * @link https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class T92ReverseLinkedListIi {

    public static void main(String[] args) {
        Solution solution = new T92ReverseLinkedListIi().new Solution();
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        for (int i = 0; i < left - 1; ++i) {
            current = current.next;
            prev = prev.next;
        }

        for (int i = left; i < right; ++i) {
            current = current.next;
        }
        ListNode tail = current.next;
        current.next = null;
        prev.next = reverseList(prev.next);
        while (prev.next != null) {prev = prev.next;}
        prev.next = tail;
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}