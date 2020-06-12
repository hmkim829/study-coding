package programmers;

// 두 정수 사이의 합
// https://programmers.co.kr/learn/courses/30/lessons/12912
public class Solution12912 {

    public static void main(String[] args) {

        int a = -10;
        int b = 60;

        System.out.println(solution(a,b));
    }

    public static long solution(int a, int b) {

        long answer = 0;

        if(a==b){
            return a;
        }

        if(Math.abs(a-b)%2 != 0){
            answer = (a+b) * ((Math.abs(a-b)+1)/2);
        }else{
            answer = (long)(a+b) * (Math.abs(a-b)/2) + (a+b)/2;
        }
        return answer;
    }
}
