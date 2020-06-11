package programmers;

import java.util.Arrays;

public class Solution42862 {

    public static void main(String[] args) {

        int n = 5;
        int[] lost = {3};
        int[] reserve = {1};

        System.out.println(solution(n,lost,reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {

        int answer = 0;

        int[] status = new int[n+1];

        Arrays.fill(status,1);

        for(int i=0;i<reserve.length;i++){
            status[reserve[i]] += 1;
        }

        for(int i=0;i<lost.length;i++){
                status[lost[i]] -= 1;
        }

        for(int i=1;i<=n;i++){
            if(status[i] > 1){

                // 왼쪽
                if(i-1>=1 && status[i-1] == 0){
                    status[i-1] += 1;
                    status[i] -= 1;
                    continue;
                }

                // 오른쪽
                if(i+1<=n && status[i+1] == 0){
                    status[i] -= 1;
                    status[i+1] += 1;
                }
            }
        }

        for(int i=1;i<=n;i++){
            if(status[i]>=1){
                answer++;
            }
        }

        return answer;
    }
}
