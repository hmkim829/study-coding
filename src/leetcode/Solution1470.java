package leetcode;

import java.util.Arrays;

// 1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/
public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];

        for(int i=0;i<n;i++){
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[i+n];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        Solution1470 sol = new Solution1470();
        System.out.println(Arrays.toString(sol.shuffle(nums, n)));
    }
}
