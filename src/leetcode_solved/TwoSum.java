package leetcode_solved;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,8,10,21};
        int target = 10;

        TwoSum ts = new TwoSum();

        System.out.println(Arrays.toString(ts.twoSum(nums, target)));

    }

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
