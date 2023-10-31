package com.leetcode.editor.cn;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author  lidongmeng
 * @date 2023-10-30 14:36:52
 * @link https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class T23MergeKSortedLists {

    public static void main(String[] args) {
        Solution solution = new T23MergeKSortedLists().new Solution();
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
    public ListNode mergeKLists(ListNode[] lists) {
        // O(nlgK) n数组长度,k元素个数
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        Queue<ListNode> q = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (int i = 0; i < lists.length; ++i) {
            if (lists[i] != null) q.add(lists[i]);
        }
        while (!q.isEmpty()) {
            ListNode top = q.poll();
            prev.next = top;
            if (top.next != null) q.add(top.next);
            prev = prev.next;
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}