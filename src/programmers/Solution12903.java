package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12903
public class Solution12903 {

    public static void main(String[] args) {

        String s = "abcd";

        System.out.println(solution(s));
    }

    public static String solution(String s) {

        String answer = "";

        int len = s.length();
        int halfLen = len/2;

        if(len%2 == 0){
           answer = s.substring(halfLen-1, halfLen+1);
        }else{
           answer = s.charAt(halfLen)+"";
        }

        return answer;
    }
}
