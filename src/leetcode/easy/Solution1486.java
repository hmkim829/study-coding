package leetcode.easy;

// 1486. XOR Operation in an Array
// https://leetcode.com/problems/xor-operation-in-an-array/
public class Solution1486 {

    public int xorOperation(int n, int start) {

        int[] arr = new int[n];
        int answer = 0;

        for(int i=0;i<n;i++){
            arr[i] = start + (2*i);
            answer ^= arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 10;
        int start = 5;

        Solution1486 sol = new Solution1486();
        System.out.println(sol.xorOperation(n, start));
    }
}
