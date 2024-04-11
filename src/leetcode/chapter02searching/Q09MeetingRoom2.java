package leetcode.chapter02searching;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// 사람들이 회의를 모두 참석하려면 몇개의 회의실이 필요한가?
public class Q09MeetingRoom2 {

    public static void main(String[] args) {

        int[][] intervals = {{5,10}, {16,20}, {0,30}}; // 2
        int[][] intervals2 = {{6,10}, {1,3}}; // 1

        Q09MeetingRoom2 question = new Q09MeetingRoom2();
        System.out.println(question.solve(intervals));
        System.out.println(question.solve(intervals2));
    }

    public int solve(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        for (int[] interval : intervals) {
            if(queue.isEmpty()) {
                queue.offer(interval);
            }else{
                if(queue.peek()[1] <= interval[0]) {
                    queue.poll();
                }
                queue.offer(interval);
            }
        }

        return queue.size();
    }
}
