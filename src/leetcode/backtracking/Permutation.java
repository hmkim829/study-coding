package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

// 46. Permutations
// https://leetcode.com/problems/permutations/
public class Permutation {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Permutation prob = new Permutation();
        System.out.println(prob.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return result;
        dfs(nums, result, list);

        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> lists, List<Integer> cur) {

        //1 담는거
        if(cur.size() == nums.length){
            List<Integer> list =  new ArrayList<>(cur);
            lists.add(list);
        }

        //2 for 탈출
        for(int i=0;i<nums.length;i++){

            if(cur.contains(nums[i]))
                continue;

            cur.add(nums[i]);
            dfs(nums, lists, cur);
            cur.remove(cur.size()-1);
        }
    }
}
