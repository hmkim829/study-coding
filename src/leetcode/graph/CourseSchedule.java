package leetcode.graph;

import java.util.LinkedList;
import java.util.Queue;

// 207. Course Schedule
// https://leetcode.com/problems/course-schedule/
public class CourseSchedule {

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {{1,0},{2,1},{3,2}};
        CourseSchedule prob = new CourseSchedule();
        System.out.println(prob.canFinish(numCourses, prerequisites));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Queue<Integer> queue = new LinkedList<>();

        int[] inDegree = new int[numCourses];
        int prerequisitesLen = prerequisites.length;
        for(int i=0;i<prerequisitesLen;i++){
            inDegree[prerequisites[i][1]]++;
        }

        int inDegreeLen = inDegree.length;
        for(int i=0;i<inDegreeLen;i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int firstCourse = queue.poll();
            for(int i=0;i<prerequisitesLen;i++){
                if(firstCourse == prerequisites[i][0]){
                    inDegree[prerequisites[i][1]]--;
                    if(inDegree[prerequisites[i][1]] == 0){
                        queue.offer(prerequisites[i][1]);
                    }
                }
            }
        }

        for(int i=0;i<inDegreeLen;i++){
            if(inDegree[i] != 0){
                return false;
            }
        }

        return true;
    }
}
