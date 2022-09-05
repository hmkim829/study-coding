package leetcode.queueStack;

import java.util.Stack;

// 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

    public static void main(String[] args) {

        String s = "()[]{}";
        ValidParentheses sol = new ValidParentheses();
        System.out.println(sol.isValid(s));
    }

    public boolean isValid(String s) {

        if(s.length()%2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(stack.isEmpty()){
                stack.push(ch);
            }else{

                if(ch == '(' || ch == '{' || ch == '['){
                    stack.push(ch);
                }else{
                    if( (stack.peek() == '(' && ch == ')')
                        || (stack.peek() == '{' && ch == '}')
                        || (stack.peek() == '[' && ch == ']')){
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
