package leetcode_inflearn;

import java.util.Stack;

// 682. Baseball Game
// https://leetcode.com/problems/baseball-game
public class BaseballGame {

    public static void main(String[] args) {

        String[] ops = {"5","2","C","D","+"};
        BaseballGame sol = new BaseballGame();
        System.out.println(sol.calPoints(ops));
    }

    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();

        for(String op : ops){
            switch (op){
                case "C" :
                    stack.pop();
                    break;
                case "D" :
                    stack.push(stack.peek()*2);
                    break;
                case "+" :
                    int x = stack.pop();
                    int y = stack.peek();
                    stack.push(x);
                    stack.push(x+y);
                    break;
                default :
                    stack.push(Integer.valueOf(op));
            }
        }

        int result = 0;
        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }
}
