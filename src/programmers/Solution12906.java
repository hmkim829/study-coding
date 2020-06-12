package programmers;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/12906
public class Solution12906 {

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        System.out.println(solution(arr));
    }

    public static int[] solution(int []arr) {

        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++){

            if(i==0){
                list.add(arr[i]);
            }else{
                if(list.get(list.size()-1) != arr[i]){
                    list.add(arr[i]);
                }
            }
        }

        answer = new int[list.size()];

        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
