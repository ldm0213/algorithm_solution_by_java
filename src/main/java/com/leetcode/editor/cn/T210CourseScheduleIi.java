package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author  lidongmeng
 * @date 2023-11-22 19:24:18
 * @link https://leetcode.com/problems/course-schedule-ii/
 */
public class T210CourseScheduleIi {

    public static void main(String[] args) {
        Solution solution = new T210CourseScheduleIi().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; ++i) graph.add(new ArrayList<>());
        int[] indegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; ++i) {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < indegree.length; ++i) {
            if (indegree[i] == 0) {
                result.add(i);
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int t = q.poll();
            for (int i = 0; i < graph.get(t).size(); ++i) {
                int next = graph.get(t).get(i);
                if (--indegree[next] == 0) {
                    q.offer(next);
                    result.add(next);
                }
            }
        }
        return result.size() == numCourses ? result.stream().mapToInt(i -> i).toArray(): new int[]{};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}