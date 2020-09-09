package leetcode;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

// 1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i=0;i<candies.length;i++){
            max = Math.max(max, candies[i]);
        }

        for(int candy : candies){
//            if(candies[i]+extraCandies >= max){
//                list.add(true);
//            }else{
//                list.add(false);
//            }
            list.add(candy+extraCandies >= max);
        }

        return list;
    }

    public static void main(String[] args) {

        Solution1431 sol = new Solution1431();

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(sol.kidsWithCandies(candies, extraCandies));
    }
}
