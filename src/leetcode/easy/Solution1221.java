package leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 1221. Split a String in Balanced Strings
// https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class Solution1221 {

    public int balancedStringSplit(String s) {

        int answer = 0;
        int balance = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L'){
                balance++;
            }else{
                balance--;
            }
            if(balance == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        String s = "RLRRLLRLRL";

        Solution1221 sol = new Solution1221();
        System.out.println(sol.balancedStringSplit(s));
    }
}
