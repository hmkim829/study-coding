package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Solution12915_ver2 {

    public static void main(String[] args) {

        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;

        String[] tmp = solution(strings, n);

        for(int i=0;i<strings.length;i++){
            System.out.print(tmp[i] + " ");
        }
    }

    public static String[] solution(String[] strings, int n) {

        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int gap = o1.charAt(n) - o2.charAt(n);

                if(gap == 0){
                    return o1.compareTo(o2);
                }else{
                    return gap;
                }
            }
        });

        answer = strings;

        return answer;
    }
}
