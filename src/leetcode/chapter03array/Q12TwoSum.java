package leetcode.chapter03array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// 1. Two Sum
// https://leetcode.com/problems/two-sum/
public class Q12TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,8,10,21};
        int target = 10;

        Q12TwoSum a = new Q12TwoSum();
        int[] result = a.twoSum(nums,target);

        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {

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
