package leetcode.chapter03array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// 1. Two Sum
// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,8,10,21};
        int target = 10;

        TwoSum a = new TwoSum();
        int[] result = a.solve(nums,target);

        System.out.println(Arrays.toString(result));
    }

    private int[] solve(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
            }else{
                map.put(target-nums[i], i);
            }
        }
        return result;
    }
}
