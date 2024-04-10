package leetcode.chapter02searching;

import java.util.*;

// 973. K Closest Points to Origin
// https://leetcode.com/problems/k-closest-points-to-origin/
public class Q07KClosestPoint {

    public static void main(String[] args) {

        int[][] points = {{1,3},{-2,2}};
        int K = 1;

        Q07KClosestPoint kcp = new Q07KClosestPoint();
        print(kcp.kClosest(points, K));
    }

    public int[][] kClosest(int[][] points, int k) {

        int[][] result = new int[k][2];
        Queue<int[]> queue = new PriorityQueue<>(points.length,
                (a,b)-> ((a[0]*a[0])+(a[1]*a[1])) - ((b[0]*b[0])+(b[1]*b[1])));

        for(int[] point : points){
            queue.offer(point);
        }

        int index = 0;
        while(index < k){
            result[index++] = queue.poll();
        }

        return result;
    }

    private static void print(int[][] kClosest) {
        for(int[] point : kClosest){
            System.out.println("[ " + point[0] + ", " + point[1] + " ]");
        }
    }
}
