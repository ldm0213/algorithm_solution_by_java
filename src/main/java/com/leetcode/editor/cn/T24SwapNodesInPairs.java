package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 14:43:01
 * @link https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class T24SwapNodesInPairs {

    public static void main(String[] args) {
        Solution solution = new T24SwapNodesInPairs().new Solution();
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        while (current != null && current.next != null) {
            ListNode tmp = current.next.next;
            prev.next = current.next;
            current.next = tmp;
            prev.next.next = current;
            prev = prev.next.next;
            current = prev.next;
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}