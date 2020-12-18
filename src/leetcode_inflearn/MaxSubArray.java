package leetcode_inflearn;

// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
public class MaxSubArray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray sol = new MaxSubArray();
        System.out.println(sol.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {

        int[] result = new int[nums.length];

        result[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            result[i] = Math.max(result[i-1]+nums[i], nums[i]);
        }

        return result[result.length-1];
    }
}
