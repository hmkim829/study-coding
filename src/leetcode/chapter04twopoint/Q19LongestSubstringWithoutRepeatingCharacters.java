package leetcode.chapter04twopoint;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 3. Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class Q19LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

//        String s = "aab";
        String s = "dvdf";

        Q19LongestSubstringWithoutRepeatingCharacters q = new Q19LongestSubstringWithoutRepeatingCharacters();
        System.out.println(q.lengthOfLongestSubstring(s));
        System.out.println(q.lengthOfLongestSubstring2(s));
    }

    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        Set<Character> charSet;

        for(int i=0;i<s.length();i++) {
            charSet = new HashSet<>();

            for(int j=i;j<s.length();j++) {
                char c = s.charAt(j);
                if(charSet.contains(c)){
                    answer = Math.max(answer, j-i);
                    break;
                }
                charSet.add(c);
            }
            answer = Math.max(answer, charSet.size());
        }

        return answer;
    }

    public int lengthOfLongestSubstring2(String s) {
         Map<Character, Integer> map = new HashMap<>();
         int left = 0;
         int right = 0;
         int max = 0;
         int count = 0;

         while (right < s.length()){
             char ch = s.charAt(right);
             map.put(ch, map.getOrDefault(ch, 0) + 1);
             if(map.get(ch) > 1) {
                 count++;
             }
             right++;

             while(count > 0) {
                 char chL = s.charAt(left);
                 if(map.get(chL) > 1) {
                     count--;
                 }
                 map.put(chL, map.get(chL)-1);
                 left++;
             }

             max = Math.max(max, right-left);
         }

         return max;
    }
}
