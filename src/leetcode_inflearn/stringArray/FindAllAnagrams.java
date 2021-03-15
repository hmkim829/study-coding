package leetcode_inflearn.stringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 438. Find All Anagrams in a String
// https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class FindAllAnagrams {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        FindAllAnagrams sol = new FindAllAnagrams();
        System.out.println(sol.findAnagrams(s,p).toString());
    }

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        int plen = p.length();

        String a = convertString(p);

        for(int i=0;i<=s.length()-p.length();i++){
            String b = convertString(s.substring(i,plen+i));

            if(a.equals(b)){
                list.add(i);
            }
        }
        return list;
    }

    private String convertString(String str) {
        char[] modP = str.toCharArray();
        Arrays.sort(modP);
        return String.valueOf(modP);
    }
}
