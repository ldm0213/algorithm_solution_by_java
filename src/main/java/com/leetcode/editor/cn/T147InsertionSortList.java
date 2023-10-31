package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-31 11:37:18
 * @link https://leetcode.com/problems/insertion-sort-list/
 */
public class T147InsertionSortList {

    public static void main(String[] args) {
        Solution solution = new T147InsertionSortList().new Solution();
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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        while (current != null) {
            // 记录下一个
            ListNode next = current.next;
            // 找到插入位置
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val <= current.val) {
                prev = prev.next;
            }
            current.next = prev.next;
            prev.next = current;
            current = next;
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}