package programmers;

// 문자열 다루기 기본
// https://programmers.co.kr/learn/courses/30/lessons/12918
public class Solution12918 {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length()==4 || s.length()==6) {
            try {
                int sNum = Integer.parseInt(s);
            } catch (Exception e) {
                answer = false;
            }
        }else{
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {

        String s = "a234";
//        String s = "1234";

        Solution12918 sol = new Solution12918();
        System.out.println(sol.solution(s));
    }
}
