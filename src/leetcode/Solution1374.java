package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

// 1374. Generate a String With Characters That Have Odd Counts
// https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
public class Solution1374 {

    public String generateTheString(int n) {

//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0;i<n-1;i++) sb.append("a");
//
//        if(n%2 != 0){
//            sb.append("b");
//        }else{
//            sb.append("a");
//        }
//
//        return sb.toString();

        char[] arr = new char[n];
        Arrays.fill(arr, 'a');

        if(n%2 == 0) arr[0] = 'b';

        return new String(arr);
    }

    public static void main(String[] args) {

        int n = 4;

        Solution1374 sol = new Solution1374();
        System.out.println(sol.generateTheString(n));
    }
}
