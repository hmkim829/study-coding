package leetcode.chapter03array;

import java.util.Arrays;
import java.util.Stack;

// 739. Daily Temperatures
// https://leetcode.com/problems/daily-temperatures/
public class Q13DailyTemperatures {

    public static void main(String[] args) {

        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};

        Q13DailyTemperatures dt = new Q13DailyTemperatures();
        System.out.println(Arrays.toString(dt.dailyTemperatures(T)));
    }

    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            while(!stack.empty() && temperatures[stack.peek()] < temperatures[i]){
                int index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }
}
