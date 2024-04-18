package leetcode.chapter01string;

import java.util.HashSet;
import java.util.Set;

// 771. Jewels and Stones
// https://leetcode.com/problems/jewels-and-stones/
public class Q02JewelsAndStones {

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        Q02JewelsAndStones js = new Q02JewelsAndStones();
        System.out.println(js.numJewelsInStones(jewels,stones));
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
}
