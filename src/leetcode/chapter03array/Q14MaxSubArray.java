package leetcode.chapter03array;

// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
public class Q14MaxSubArray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Q14MaxSubArray sol = new Q14MaxSubArray();
        System.out.println(sol.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {

        int curSum = nums[0];
        int maxSum = nums[0];

        for(int i=1;i<nums.length;i++){
            curSum = Math.max(curSum + nums[i], nums[i]);
            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }
}
