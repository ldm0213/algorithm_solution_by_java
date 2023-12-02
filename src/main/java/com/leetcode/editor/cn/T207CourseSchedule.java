package com.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author  lidongmeng
 * @date 2023-11-03 16:04:32
 * @link https://leetcode.com/problems/course-schedule/
 */
public class T207CourseSchedule {

    public static void main(String[] args) {
        Solution solution = new T207CourseSchedule().new Solution();
        // write test case
    }

	//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 如果一个节点能开始学习了，说明该节点前置依赖已经全部完成，该节点一定不会有任何入边，也就是它没有任何的先修课程要求。
        // 当我们将一个节点加入答案中后，我们就可以移除它的所有出边，代表着它的相邻节点少了一门先修课程的要求。
        // 如果某个相邻节点变成了「没有任何入边的节点」，那么就代表着这门课可以开始学习了。
        // 按照这样的流程，我们不断地将没有入边的节点加入答案，直到答案中包含所有的节点或者不存在没有入边的节点（图中包含环）
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; ++i) graph.add(new ArrayList<>());
        for (int i = 0; i < prerequisites.length; ++i) {
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < indegree.length; ++i) {
            if (indegree[i] == 0) q.offer(i);
        }

        int visited = 0;
        while (!q.isEmpty()) {
            visited++;
            int t = q.poll();
            for (int i = 0; i < graph.get(t).size(); ++i) {
                int tmp = graph.get(t).get(i);
                if (--indegree[tmp] == 0) q.offer(tmp);
            }
        }
        return visited == numCourses;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}