package leetcode_inflearn;

import java.util.ArrayList;
import java.util.List;

// 22. Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/
public class GenerateParentheses {

    public static void main(String[] args) {
        int n = 3;
        GenerateParentheses prob = new GenerateParentheses();
        System.out.println(prob.generateParenthesis(n));
    }

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        dfs(result, "", n, n, "");
        return result;
    }

    int count = 0;
    private void dfs(List<String> result, String str, int left, int right, String str1) {

        count++;
        System.out.println("str\t"+str+"\t left: "+left+" right: "+right+" count: "+count+" str1: "+str1);

        //1
        if(left < 0 || left > right ) return;

        //2
        if(left == 0 && right == 0) {
            result.add(str);
            return;
        }

        dfs(result, str + "(", left-1, right, str1+"+");
        dfs(result, str + ")", left, right-1, str1+"-");
    }
}
