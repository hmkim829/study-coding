package leetcode.chapter03array;

import java.util.Arrays;
import java.util.Stack;

// 739. Daily Temperatures
// https://leetcode.com/problems/daily-temperatures/
public class DailyTemperatures {

    public static void main(String[] args) {

        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};

        DailyTemperatures dt = new DailyTemperatures();
        System.out.println(Arrays.toString(dt.dailyTemperatures(T)));
    }

    public int[] dailyTemperatures(int[] T) {

        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[T.length];

        for(int i=0;i<T.length;i++){

            while(!stack.empty() && T[stack.peek()] < T[i]){
                int index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }
}
