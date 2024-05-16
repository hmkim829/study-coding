package leetcode.chapter02searching;

// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/
public class Q10MergeIntervalsTest {

    public static void main(String[] args) {

        int[][] intervals = {{2,6},{8,10},{1,3},{15,18}};   // [1,6][8,10][15,18]
        int[][] intervals2 = {{1,4},{4,5}};                 // [1,5]

        Q10MergeIntervalsTest mi = new Q10MergeIntervalsTest();
        print(mi.merge(intervals));
        print(mi.merge(intervals2));
    }

    public int[][] merge(int[][] intervals) {

        return null;
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
