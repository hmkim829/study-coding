package leetcode_inflearn.stringArray;

import java.util.*;

// 973. K Closest Points to Origin
// https://leetcode.com/problems/k-closest-points-to-origin/
public class KClosestPoint {

    public static void main(String[] args) {

        int[][] points = {{1,3},{-2,2}};
        int K = 1;

        KClosestPoint kcp = new KClosestPoint();
        print(kcp.kClosest(points, K));
    }

    public int[][] kClosest(int[][] points, int K) {

        int[][] result = new int[K][2];
        Queue<int[]> queue = new PriorityQueue<int[]>(points.length,
                (a,b)-> ((a[0]*a[0])+(a[1]*a[1])) - ((b[0]*b[0])+(b[1]*b[1])));

        for(int[] point : points){
            queue.offer(point);
        }

        for(int i=0;i<K;i++){
            result[i] = queue.poll();
        }

        return result;
    }

    private static void print(int[][] kClosest) {
        for(int[] point : kClosest){
            System.out.println("[ " + point[0] + ", " + point[1] + " ]");
        }
    }
}
