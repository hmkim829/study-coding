package leetcode_inflearn.stringArray;

import util.Interval;

import java.util.*;

// 253. Meeting Rooms II
public class MeetingRooms2 {

    public static void main(String[] args) {

        Interval in1 = new Interval(5,10);
        Interval in2 = new Interval(15,20);
        Interval in3 = new Interval(0,30);

        MeetingRooms2 mr2 = new MeetingRooms2();
        Interval[] intervs = {in1,in2,in3};
        System.out.println(mr2.solve(intervs));
    }

    public int solve(Interval[] intervs){

        Arrays.sort(intervs,(a,b) -> a.start-b.start);
        Queue<Interval> minHeap = new PriorityQueue<Interval>(intervs.length,(a,b) -> a.end-b.end);
        int max = 0;

        for(int i=0;i<intervs.length;i++){

            while (!minHeap.isEmpty() && minHeap.peek().end <= intervs[i].start){
                minHeap.poll();
            }
            minHeap.offer(intervs[i]); // 0 30, 5 10, 15,20
            max = Math.max(max, minHeap.size());
        }

        return max;
    }
}
