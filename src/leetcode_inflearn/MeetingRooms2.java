package leetcode_inflearn;

import java.util.*;

// 253. Meeting Rooms II
class Interv{
    int start;
    int end;

    public Interv(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MeetingRooms2 {

    public static void main(String[] args) {

        Interv in1 = new Interv(5,10);
        Interv in2 = new Interv(15,20);
        Interv in3 = new Interv(0,30);

        MeetingRooms2 mr2 = new MeetingRooms2();
        Interv[] intervs = {in1,in2,in3};
        System.out.println(mr2.solve(intervs));
    }

    public int solve(Interv[] intervs){

        Arrays.sort(intervs,(a,b) -> a.start-b.start);
        Queue<Interv> minHeap = new PriorityQueue<Interv>(intervs.length,(a,b) -> a.end-b.end);
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
