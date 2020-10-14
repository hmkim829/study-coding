package leetcode.easy;

// 1342. Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Solution1342 {
    public int numberOfSteps (int num) {

        int answer = 0;

        while(num > 0){

            if(num%2 == 0) num /= 2;
            else num -= 1;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        int num = 14;

        Solution1342 sol = new Solution1342();
        System.out.println(sol.numberOfSteps(num));
    }
}
