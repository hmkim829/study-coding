package leetcode.chapter07graph;

import java.util.*;

// 301. Remove Invalid Parentheses
// https://leetcode.com/problems/remove-invalid-parentheses/
public class RemoveInvalidParentheses {

    public static void main(String[] args) {

        String s = "()())()";
        RemoveInvalidParentheses prob = new RemoveInvalidParentheses();
        System.out.println(prob.removeInvalidParentheses(s)); // ["()()()", "(())()"]
    }

    public List<String> removeInvalidParentheses(String s) {

        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(s);
        boolean found = false;

        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                String str = queue.poll();
                if(isVaild(str)){
                    list.add(str);
                    found = true;
                }

                if(found) continue;

                for(int j=0;j<str.length();j++){

                    if(str.charAt(j) != '(' && str.charAt(j) != ')') continue;

                    String newStr = str.substring(0,j) + str.substring(j+1);
                    if(!visited.contains(newStr)){
                        queue.offer(newStr);
                        visited.add(newStr);
                    }
                }
            }

        }

        return list;
    }

    private boolean isVaild(String s) {
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            }else if(ch == ')'){
                count--;
                if(count < 0){
                    return false;
                }
            }
        }
        return count == 0;
    }
}
