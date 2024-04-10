package leetcode.chapter02searching;

import java.util.Arrays;
import java.util.Comparator;

public class Q08MeetingRoom {

    public static void main(String[] args) {

        int[][] intervals = {{5,10}, {16,20}, {0,30}};
        int[][] intervals2 = {{7,10}, {2,4}};

        Q08MeetingRoom question = new Q08MeetingRoom();
        System.out.println(question.solve(intervals));
        System.out.println(question.solve(intervals2));
    }

    public boolean solve(int[][] intervals) {

//        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++) {
            if(end > intervals[i][0]) {
                return false;
            }
            end = intervals[i][1];
        }

        return true;
    }
}
