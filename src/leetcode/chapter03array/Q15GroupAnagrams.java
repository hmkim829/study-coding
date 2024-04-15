package leetcode.chapter03array;

import java.util.*;

// 49. Group Anagrams
// https://leetcode.com/problems/group-anagrams/
public class Q15GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0)  return new ArrayList<>();

        //1
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        //2
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);

            if(!map.containsKey(key)) map.put(key, new ArrayList<String>());
            map.get(key).add(str);
        }
        result.addAll(map.values());

        return result;
    }
}
