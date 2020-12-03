package leetcode_solved;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Interval{
    int start;
    int end;

    void Integer(){
        this.start = 0;
        this.end = 0;
    }

    Interval(int s, int e){
        this.start = s;
        this.end = e;
    }
}

public class MeetingRooms {

    public static void main(String[] args) {

        MeetingRooms a = new MeetingRooms();

        Interval in1 = new Interval(15,20);
        Interval in2 = new Interval(5,10);
        Interval in3 = new Interval(0,30);

        Interval[] intervals = {in1, in2, in3};
        System.out.println(a.solve(intervals));

    }

    public boolean solve(Interval[] intervals){

        List<Interval> result = Arrays.stream(intervals)
            .sorted((a,b) -> a.start - b.start)
            .collect(Collectors.toList());

        for(int i=1;i<result.size();i++){
            if(result.get(i-1).end < result.get(i).start){
                return false;
            }
        }
        return true;
    }

    public void print(Interval[] intervals){
        for(int i=0;i<intervals.length;i++){
            Interval in = intervals[i];
            System.out.println(in.start + " " + in.end);
        }
    }
}
