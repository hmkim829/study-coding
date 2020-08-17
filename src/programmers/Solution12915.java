package programmers;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내 맘대로 정렬하기
// https://programmers.co.kr/learn/courses/30/lessons/12915
public class Solution12915 {

    public static void main(String[] args) {

        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;

        String[] tmp = solution(strings, n);

        for(int i=0;i<strings.length;i++){
            System.out.print(tmp[i]+" ");
        }
    }

    public static String[] solution(String[] strings, int n) {

        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int comp = o1.charAt(n) - o2.charAt(n);

                if(comp == 0){
                    for(int i=n+1;i<o1.length();i++){
                        if(comp != 0){
                            return comp;
                        }
                    }
                }
                return comp;
            }
        });

        answer = strings;

        return answer;
    }
}
