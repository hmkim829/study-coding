package leetcode_inflearn.stringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

    public static void main(String[] args) {

        //int[][] intervals = {{2,6},{8,10},{1,3},{15,18}};
        int[][] intervals = {{1,4},{4,5}};

        MergeIntervals mi = new MergeIntervals();
        print(mi.merge(intervals));
    }

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> preResult = new ArrayList<int[]>();

        int[] before = intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] current = intervals[i];
            if(before[1] >= current[0]){
                before[1] = Math.max(before[1], current[1]);
            }else{
                preResult.add(before);
                before = current;
            }
        }

        if(preResult.size() > 0) {
            int[] last = preResult.get(preResult.size() - 1);
            if (last[0] != before[0] && last[1] != before[1]) {
                preResult.add(before);
            }
        }else{
            preResult.add(before);
        }

        int[][] result = new int[preResult.size()][2];
        for(int i=0;i<preResult.size();i++){
            result[i][0] = preResult.get(i)[0];
            result[i][1] = preResult.get(i)[1];
        }

        return result;
    }

    public static void print(int[][] intervals){

        for(int i=0;i<intervals.length;i++){
            System.out.print("[ ");
            for(int j=0;j<intervals[i].length;j++){
                System.out.print(intervals[i][j] + " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
}
