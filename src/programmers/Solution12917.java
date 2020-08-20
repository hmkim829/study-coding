package programmers;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내림차순으로 배치하기
// https://programmers.co.kr/learn/courses/30/lessons/12917
public class Solution12917 {

    public static void main(String[] args) {

        String s = "Zbcdefg";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";

        Character[] sChar = new Character[s.length()];

        for(int i=0;i<s.length();i++){
            sChar[i] = s.charAt(i);
        }

        Arrays.sort(sChar, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2 - o1;
            }
        });

        for(int i=0;i< sChar.length;i++){
            answer += sChar[i];
        }

        return answer;
    }
}
