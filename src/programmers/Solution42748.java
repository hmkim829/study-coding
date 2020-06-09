package programmers;

import java.util.Arrays;

public class Solution42748 {

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(solution(array, commands));
    }

    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int i=0;i<commands.length;i++) {

            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int point = commands[i][2]-1;

            int[] tmpArr = new int[end - start + 1];
            int cnt = 0;

            for (int j = start; j <= end; j++) {
                tmpArr[cnt++] = array[j];
            }

            Arrays.sort(tmpArr);
            answer[i] = tmpArr[point];
        }

        return answer;
    }
}
