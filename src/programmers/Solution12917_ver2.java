package programmers;

// 문자열 내림차순으로 배치하기
// https://programmers.co.kr/learn/courses/30/lessons/12917
public class Solution12917_ver2 {

    public String solution(String s) {

        char[] sChar = s.toCharArray();

        StringBuilder sb = new StringBuilder(String.valueOf(sChar));
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {

        Solution12917_ver2 vo = new Solution12917_ver2();
        String s = "Zbcdefg";

        System.out.println(vo.solution(s));
    }
}
