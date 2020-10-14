package leetcode.easy;

//1528. Shuffle String
// https://leetcode.com/problems/shuffle-string/
public class Solution1528 {
    public String restoreString(String s, int[] indices) {

        char[] arr = new char[s.length()];

        for(int i=0;i<indices.length;i++){
            arr[indices[i]] = s.charAt(i);
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        Solution1528 sol = new Solution1528();
        System.out.println(sol.restoreString(s,indices));
    }
}
