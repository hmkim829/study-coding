package leetcode.dynamic;

import java.util.Arrays;

// 300. Longest Increasing Subsequence
// https://leetcode.com/problems/longest-increasing-subsequence/
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        int[] nums = {1,2,3,2,5,2,6,10,4,12};
        LongestIncreasingSubsequence prob = new LongestIncreasingSubsequence();
        System.out.println(prob.lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {
        int result = 1;

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
