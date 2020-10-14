package leetcode.easy;

import java.util.Arrays;

// 1365. How Many Numbers Are Smaller Than the Current Number
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

//        int[] answer = new int[nums.length];
//
//        for(int i=0;i<nums.length;i++){
//            int cnt = 0;
//            for(int j=0;j<nums.length;j++){
//                if(i != j && nums[i] > nums[j]){
//                    cnt++;
//                }
//            }
//            answer[i] = cnt;
//        }
//
//        return answer;

        int[] count = new int[101];
        int[] answer = new int[nums.length];

        for(int num : nums) count[num]++;

        for(int i=1;i<count.length;i++) count[i] += count[i-1];

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                answer[i] = 0;
            }else{
                answer[i] = count[nums[i]-1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        //int[] nums = {8,1,2,2,3};
        int[] nums = {5,0,10,0,10,6};

        Solution1365 sol = new Solution1365();
        System.out.println(Arrays.toString(sol.smallerNumbersThanCurrent(nums)));
    }
}
