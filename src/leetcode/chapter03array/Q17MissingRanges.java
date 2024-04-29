package leetcode.chapter03array;

import java.util.ArrayList;
import java.util.List;

/*
    모든 요소를 포함하는 범위[lower,upper]와 정렬된 고유한 정수 배열 nums가 주어집니다.
    만약에 x라는 number가 범위[lower, upper] 존재하고 nums 배열에 없다면 누락된 값으로 간주합니다.
    누락된 모든 숫자를 정확히 포함하는 가장 작은 정렬된 범위를 리턴합니다.

    [a, b] 목록의 각 범위는 다음과 같이 출력되어야 합니다.
    “a->b” if a!=b
    “a” if a==b
 */
public class Q17MissingRanges {
    public static void main(String[] args) {

        int[] nums = {2,3,5,50,75};
        int lower = 0;
        int upper = 99;

        Q17MissingRanges q = new Q17MissingRanges();
        System.out.println(q.missingRange(nums, lower, upper).toString());
    }

    public List<String> missingRange(int[] nums, int lower, int upper){

        List<String> result = new ArrayList<>();

        if(lower < nums[0]) {
            result.add(makeRange(lower, nums[0]-1));
        }

        for(int i=0;i<nums.length-1;i++) {
            if(nums[i] != nums[i+1] && nums[i]+1 < nums[i+1]){
                result.add(makeRange(nums[i]+1, nums[i+1]-1));
            }
        }

        if(nums[nums.length-1] < upper) {
            result.add(makeRange (nums[nums.length-1]+1, upper));
        }

        return result;
    }

    private String makeRange(int start, int end) {
        return start==end ? String.valueOf(start) : start+"->"+end;
    }
}
