package leetcode.dynamic;

// 70. Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/
public class ClimbStairs {

    public static void main(String[] args) {
        int n = 3;
        ClimbStairs prob = new ClimbStairs();
        System.out.println(prob.climbStairs(n));
    }

    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];
    }
}
