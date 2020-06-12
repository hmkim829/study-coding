package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 나누어 떨어지는 숫자 배열
// https://programmers.co.kr/learn/courses/30/lessons/12910
public class Solution12910 {

    public static void main(String[] args) {

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }

        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            Arrays.sort(answer);
        }

        return answer;
    }
}
