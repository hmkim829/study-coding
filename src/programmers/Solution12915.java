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

        for(int i=0;i< strings.length;i++){
            for(int j=i+1;j< strings.length;j++){

                int gap = strings[i].charAt(n) - strings[j].charAt(n);

                if(gap == 0){
                    int len = strings[i].length() >= strings[j].length() ? strings[j].length() : strings[i].length();
                    for(int z=0;z<len;z++){

                        int subGap = strings[i].charAt(z) - strings[j].charAt(z);

                        if(subGap > 0){
                            String tmp = strings[j];
                            strings[j] = strings[i];
                            strings[i] = tmp;
                            break;
                        }else if(subGap < 0){
                            break;
                        }
                    }
                }else if(gap > 0){
                    String tmp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = tmp;
                }
            }
        }

        answer = strings;

        return answer;
    }
}
