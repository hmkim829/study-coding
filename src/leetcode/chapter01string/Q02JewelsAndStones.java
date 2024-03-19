package leetcode.chapter01string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 771. Jewels and Stones
// https://leetcode.com/problems/jewels-and-stones/
public class Q02JewelsAndStones {

    public static void main(String[] args) {

        String J = "aA", S = "aAAbbbb";

        Q02JewelsAndStones js = new Q02JewelsAndStones();
        System.out.println(js.numJewelsInStones(J,S));
        System.out.println(js.solve1(J,S));
    }

    // 강사님 풀이
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> set = new HashSet<>();
        for(char jew : jewels.toCharArray()){
            set.add(jew);
        }

        int result = 0;
        for(char stone : stones.toCharArray()){
            if(set.contains(stone)){
                result++;
            }
        }

        return result;
    }

    // 내가 한 풀이
    public int solve1(String jewels, String stones){

        int count = 0;
        Map<Character,Integer> stonesMap = new HashMap<>();

        for(char ch : stones.toCharArray()){
            stonesMap.put(ch, stonesMap.getOrDefault(ch,0)+1);
        }

        for(char ch : jewels.toCharArray()){
            count += stonesMap.get(ch);
        }

        return count;
    }
}
