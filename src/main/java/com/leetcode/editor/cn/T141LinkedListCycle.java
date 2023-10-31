package com.leetcode.editor.cn;

 /**
 * @author  lidongmeng
 * @date 2023-10-30 15:46:31
 * @link https://leetcode.com/problems/linked-list-cycle/
 */
public class T141LinkedListCycle {

    public static void main(String[] args) {
        Solution solution = new T141LinkedListCycle().new Solution();
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
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}