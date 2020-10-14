package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1389. Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/
public class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];

        // 1.
//        for(int i=0;i<nums.length;i++){
//
//            //뒤로밀기
//            for(int j=nums.length-1;j>index[i];j--){
//                target[j] = target[j-1];
//            }
//
//            target[index[i]] = nums[i];
//        }

        // 2.
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++) list.add(index[i], nums[i]);
        for(int i=0;i<list.size();i++) target[i] = list.get(i);

        return target;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        Solution1389 sol = new Solution1389();
        System.out.println(Arrays.toString(sol.createTargetArray(nums,index)));
    }
}
