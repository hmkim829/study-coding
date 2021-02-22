package leetcode_inflearn;

import java.util.ArrayList;
import java.util.List;

// 78. Subsets
// https://leetcode.com/problems/subsets/
public class Subsets {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        Subsets prob = new Subsets();
        System.out.println(prob.subsets(nums));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return result;
        dfs(nums, result, list, 0);

        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result, List<Integer> cur, int start) {

        result.add(new ArrayList<>(cur));

        for(int i=start;i<nums.length;i++){
            cur.add(nums[i]);
            dfs(nums, result, cur, i+1);
            cur.remove(cur.size()-1);
        }
    }
}
