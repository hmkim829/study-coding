package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

// 771. Jewels and Stones
// https://leetcode.com/problems/jewels-and-stones/
public class Solution771 {
    public int numJewelsInStones(String J, String S) {

        int answer = 0;

        Set<Character> set = new HashSet<Character>();

        for(char ch : J.toCharArray()){
            set.add(ch);
        }

        for(char ch : S.toCharArray()){
            if(set.contains(ch)){
               answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String J = "aA";
        String S = "aAAbbbb";

        Solution771 sol = new Solution771();
        System.out.println(sol.numJewelsInStones(J,S));
    }
}
