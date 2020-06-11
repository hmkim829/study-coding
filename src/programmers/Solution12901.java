package programmers;

public class Solution12901 {

    public static void main(String[] args) {

        int a = 5;
        int b = 24;

        System.out.println(solution(a,b));
    }

    public static String solution(int a, int b) {
        String answer = "";

        int[] day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] mon = {"FRI","SAT","SUN","MON","TUE","WED","THU"};


        if(a > 1){

            int tmp = 0;

            for(int i=1;i<a;i++){
                tmp += day[i];
            }

            tmp += b-1;

            answer = mon[tmp%7];

        }else{
            answer = mon[b-1 % 7];
        }

        return answer;
    }
}
