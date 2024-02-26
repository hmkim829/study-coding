package leetcode.chapter01string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 771. Jewels and Stones
// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {

    public static void main(String[] args) {

        String J = "aA", S = "aAAbbbb";

        JewelsAndStones js = new JewelsAndStones();
        System.out.println(js.numJewelsInStones(J,S));
        System.out.println(js.solve1(J,S));
    }

    public int numJewelsInStones(String J, String S) {

//        int result = 0;
//
//        for(int i=0;i<S.length();i++){
//
//            char c = S.charAt(i);
//            if(J.indexOf(String.valueOf(c)) > -1){
//                result++;
//            }
//        }

        Set<Character> set = new HashSet<Character>();
        for(char jew : J.toCharArray()){
            set.add(jew);
        }

        int result = 0;
        for(char stone : S.toCharArray()){
            if(set.contains(stone)){
                result++;
            }
        }

        return result;
    }

    public int solve1(String jewels, String stones){
        int result = 0;

        Map<Character,Integer> stoneMap = new HashMap<>();
        for(char ch : stones.toCharArray()){
            stoneMap.put(ch, stoneMap.getOrDefault(ch,0)+1);
        }

        for(char ch : jewels.toCharArray()){
            result += stoneMap.get(ch);
        }

        return result;
    }
}
