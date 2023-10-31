package com.leetcode.editor.cn;

import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-10-30 15:34:45
 * @link https://leetcode.com/problems/partition-list/
 */
public class T86PartitionList {

    public static void main(String[] args) {
        Solution solution = new T86PartitionList().new Solution();
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
    public ListNode partition(ListNode head, int x) {
        ListNode bigger = new ListNode(0);
        ListNode smaller = new ListNode(0);
        ListNode prevBigger = bigger;
        ListNode prevSmaller = smaller;
        while (head != null) {
            if (head.val < x) {
                prevSmaller.next = head;
                prevSmaller = prevSmaller.next;
            } else {
                prevBigger.next = head;
                prevBigger = prevBigger.next;
            }
            head = head.next;
        }
        prevBigger.next = null;
        prevSmaller.next = bigger.next;
        return smaller.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}