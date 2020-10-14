package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 1313. Decompress Run-Length Encoded List
// https://leetcode.com/problems/decompress-run-length-encoded-list/
public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {

//        List<Integer> list = new ArrayList<Integer>();
//
//        for(int i=0;i<nums.length-1;i+=2){
//            for(int j=0;j<nums[i];j++){
//                list.add(nums[i+1]);
//            }
//        }
//
//        int[] answer = new int[list.size()];
//
//        for(int i=0;i<list.size();i++){
//            answer[i] = list.get(i);
//        }
//
//        return answer;

        int len = 0;

        for(int i=0;i<nums.length;i+=2){
            len += nums[i];
        }

        int[] answer = new int[len];
        int cnt = 0;

        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                answer[cnt++] = nums[i+1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        Solution1313 sol = new Solution1313();
        System.out.println(Arrays.toString(sol.decompressRLElist(nums)));
    }
}
