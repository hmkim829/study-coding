package leetcode.stringArray;

import java.util.Arrays;

// 283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/
public class MoveZeros {

    public static void main(String[] args) {

        int[] nums = {0,3,2,0,8,5};

        // 1. 0이 아닌 수를 앞으로 옮긴다.
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        // 2. 0의 수만큼 뒤에 0을 채운다.
        while(index < nums.length){
            nums[index++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
