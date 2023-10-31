package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 15:16:17
 * @link https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 */
public class T82RemoveDuplicatesFromSortedListIi {

    public static void main(String[] args) {
        Solution solution = new T82RemoveDuplicatesFromSortedListIi().new Solution();
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;
        while (current != null) {
            int cnt = 0;
            ListNode tmp = current;
            while (current != null && current.val == tmp.val) {current = current.next; cnt++;}
            if (cnt == 1) {
                prev.next = tmp;
                prev = prev.next;
            }
        }
        prev.next = null;
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}