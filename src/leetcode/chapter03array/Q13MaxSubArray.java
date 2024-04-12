package leetcode.chapter03array;

// 53. Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
public class Q13MaxSubArray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Q13MaxSubArray sol = new Q13MaxSubArray();
        System.out.println(sol.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {

        int newSum = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            newSum = Math.max(newSum + nums[i], nums[i]);
            max = Math.max(newSum, max);
        }

        return max;
    }
}
