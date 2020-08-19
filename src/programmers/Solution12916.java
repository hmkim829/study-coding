package programmers;

import java.util.ArrayList;
import java.util.List;

// 문자열 내 p와 y의 개수
// https://programmers.co.kr/learn/courses/30/lessons/12916?language=java
public class Solution12916 {

    public static void main(String[] args) {

        String s = "Pyy";

        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0;
        int yCnt = 0;

        for(int i=0;i<s.length();i++){
            String tmpStr = Character.toString(s.charAt(i));

            if(tmpStr.equalsIgnoreCase("p")){
                pCnt++;
            }else if(tmpStr.equalsIgnoreCase("y")){
                yCnt++;
            }
        }

        if(pCnt != yCnt){
            answer = false;
        }

        if(pCnt == 0 && yCnt == 0){
            answer = true;
        }

        return answer;
    }
}
