package leetcode_inflearn;

import util.Interval;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public static void main(String[] args) {

        MeetingRooms a = new MeetingRooms();

        Interval in1 = new Interval(15,20);
        Interval in2 = new Interval(5,10);
        Interval in3 = new Interval(0,30);

//        Interval in1 = new Interval(7,10);
//        Interval in2 = new Interval(2,4);

        Interval[] intervals = {in1, in2, in3};
//        Interval[] intervals = {in1, in2};
        System.out.println(a.solve(intervals));

    }

    public boolean solve(Interval[] intervals){

        //1 정렬
        if(intervals == null)
            return false;
        print(intervals);//15 5 0
        Arrays.sort(intervals, comp);
        System.out.println("==========");
        print(intervals);//0 5 15

        //2 비교
        for(int i=1;i<intervals.length;i++){
            if(intervals[i-1].end > intervals[i].start){
                return false;
            }
        }
        return true;
    }

    Comparator<Interval> comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    };

    public void print(Interval[] intervals){
        for(int i=0;i<intervals.length;i++){
            Interval in = intervals[i];
            System.out.println(in.start + " " + in.end);
        }
    }
}
