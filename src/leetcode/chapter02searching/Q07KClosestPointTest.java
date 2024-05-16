package leetcode.chapter02searching;

// 973. K Closest Points to Origin
// https://leetcode.com/problems/k-closest-points-to-origin/
public class Q07KClosestPointTest {

    public static void main(String[] args) {

        int[][] points = {{1,3},{-2,2}};
        int K = 1;

        Q07KClosestPointTest kcp = new Q07KClosestPointTest();
        print(kcp.kClosest(points, K));
    }

    public int[][] kClosest(int[][] points, int k) {

        return null;
    }

    private static void print(int[][] kClosest) {
        for(int[] point : kClosest){
            System.out.println("[ " + point[0] + ", " + point[1] + " ]");
        }
    }
}
