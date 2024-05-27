package leetcode.chapter04twopoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 438. Find All Anagrams in a String
// https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class Q21FindAllAnagrams {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        Q21FindAllAnagrams sol = new Q21FindAllAnagrams();
        System.out.println(sol.findAnagrams(s,p).toString());
        System.out.println(sol.findAnagrams2(s, p).toString());
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

    public List<Integer> findAnagrams2(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int[] pArr = new int[26];
        for(int i=0;i<p.length();i++) {
            pArr[p.charAt(i) - 'a']++;
        }

        for(int i=0;i<=s.length()-p.length();i++) {
            int[] sArr = new int[26];
            for(int j=0;j<p.length();j++) {
                sArr[s.charAt(i+j) - 'a']++;
            }

            if(checkArr(sArr, pArr)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean checkArr(int[] sArr, int[] pArr) {

        for(int i=0;i<sArr.length;i++) {
            if(sArr[i] != pArr[i]) {
                return false;
            }
        }

        return true;
    }
}
