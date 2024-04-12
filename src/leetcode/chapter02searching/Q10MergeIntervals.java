package leetcode.chapter02searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/
public class Q10MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = {{2,6},{8,10},{1,3},{15,18}};   // [1,6][8,10][15,18]
        int[][] intervals2 = {{1,4},{4,5}};                 // [1,5]

        Q10MergeIntervals mi = new Q10MergeIntervals();
        print(mi.merge(intervals));
        print(mi.merge(intervals2));
    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }else{
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }

    public static void print(int[][] intervals){

        for (int[] interval : intervals) {
            System.out.print("[ ");
            for (int i : interval) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}
