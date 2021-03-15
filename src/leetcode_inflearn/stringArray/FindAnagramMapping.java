package leetcode_inflearn.stringArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 760. Find Anagram Mappings
public class FindAnagramMapping {

    public static void main(String[] args) {

        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};

        FindAnagramMapping sol = new FindAnagramMapping();
        System.out.println(Arrays.toString(sol.anagramMappings(A,B)));
    }

    public int[] anagramMappings(int[] A, int[] B) {

        int[] P = new int[A.length];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<B.length;i++){
            map.put(B[i], i);
        }

        for(int i=0;i<A.length;i++){
            P[i] = map.get(A[i]);
        }

        return P;
    }
}
