package leetcode.chapter03array;

import java.util.*;

// 49. Group Anagrams
// https://leetcode.com/problems/group-anagrams/
public class Q15GroupAnagrams {

    public static void main(String[] args) {
        String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strArr));
    }

    public static List<List<String>> groupAnagrams(String[] strArr) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strArr){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);

            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
