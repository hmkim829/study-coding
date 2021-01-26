package programmers;

import java.util.*;

// 두 개 뽑아서 더하기
// https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
public class TwoNumbersPlus {

    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};
        TwoNumbersPlus prob = new TwoNumbersPlus();
        System.out.println(Arrays.toString(prob.solution(numbers)));
    }

    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new TreeSet<>();

        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int num = numbers[i] + numbers[j];
                set.add(num);
            }
        }

        Iterator ir = set.iterator();

        answer = new int[set.size()];
        int cnt = 0;
        while(ir.hasNext()){
            answer[cnt++] = (Integer)ir.next();
        }

        return answer;
    }
}
