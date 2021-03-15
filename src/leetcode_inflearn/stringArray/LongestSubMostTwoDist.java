package leetcode_inflearn.stringArray;

import java.util.*;

// 159. Longest Substring with At Most Two Distinct Characters
public class LongestSubMostTwoDist {

    public static void main(String[] args) {

        String s = "eceba";
//        String s = "ccaabbb";

        LongestSubMostTwoDist lsmtd = new LongestSubMostTwoDist();
        System.out.println(lsmtd.lengthOfLongestSubstringTwoDistinct(s));
    }

    public int lengthOfLongestSubstringTwoDistinct(String s){

//        Queue<Character> queue = new LinkedList<Character>();
//        Set<Character> set = new HashSet<>();
//        int max = 0;
//
//        for(char c : s.toCharArray()){
//            boolean type = false;
//
//            if(set.size() == 2){
//                if(set.contains(c)){
//                    type = true;
//                }else{
//                    char tmp = queue.peek();
//                    while(tmp == queue.peek()){
//                        queue.poll();
//                    }
//                    set.remove(tmp);
//                    set.add(c);
//                    type = true;
//                }
//
//            }else if(set.size() < 2){
//                type = true;
//                set.add(c);
//            }
//
//            queue.offer(c);
//
//            if(type)
//                max = Math.max(max, queue.size());
//        }
//
//        return max;

        int start = 0, end = 0, len = 0, counter = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(end < s.length()){

            char endChar = s.charAt(end);
            map.put(endChar, map.getOrDefault(endChar,0)+1);
            if(map.get(endChar) == 1) counter++;
            end++;

            while(counter > 2){
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar)-1);
                if(map.get(startChar) == 0) counter--;
                start++;
            }

            len = Math.max(len, end-start);
        }
        return len;
    }
}
