package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 15:09:52
 * @link https://leetcode.com/problems/rotate-list/
 */
public class T61RotateList {

    public static void main(String[] args) {
        Solution solution = new T61RotateList().new Solution();
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
    private int getLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        int len = getLen(head);
        k = k % len;
        if (k == 0) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 0; i < k; ++i) head = head.next;
        while (head != null) {
            head = head.next;
            prev = prev.next;
        }
        ListNode t = prev.next;
        prev.next = null;
        ListNode tmp = t;
        while (tmp.next != null) tmp = tmp.next;
        tmp.next = dummy.next;
        return t;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}