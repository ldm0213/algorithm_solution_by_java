package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 21:19:17
 * @link https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class T160IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        Solution solution = new T160IntersectionOfTwoLinkedLists().new Solution();
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
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int getLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLen(headA), lenB = getLen(headB);
        int diff = Math.abs(lenA - lenB);
        if (lenA > lenB) {
            for (int i = 0; i < diff; ++i) headA = headA.next;
        } else {
            for (int i = 0; i < diff; ++i) headB = headB.next;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}