package programmers;

// 서울에서 김서방 찾기
// https://programmers.co.kr/learn/courses/30/lessons/12919
public class Solution12919 {
    public String solution(String[] seoul) {

        String answer = "";

        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                answer = Integer.toString(i);
            }
        }

        return "김서방은 " + answer + "에 있다";
    }

    public static void main(String[] args) {
        Solution12919 sol = new Solution12919();

        String[] seoul = {"Jane", "Kim"};

        System.out.println(sol.solution(seoul));
    }
}
