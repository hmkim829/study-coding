package leetcode.chapter03array;

// 42. Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/
public class Q16TrappingRainWater {

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Q16TrappingRainWater sol = new Q16TrappingRainWater();
        System.out.println(sol.trap(height));
    }

    public int trap(int[] height) {

        int answer = 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = Integer.MIN_VALUE;

        // left
        for(int i=0; i<height.length; i++){
            if(max < height[i]){
                max = height[i];
            }
            left[i] = max;
        }

        // right
        max = Integer.MIN_VALUE;
        for(int i=height.length-1; i>=0; i--){
            if(max < height[i]){
                max = height[i];
            }
            right[i] = max;
        }

        for(int i=0; i<height.length; i++){
            answer += Math.min(left[i], right[i]) - height[i];
        }

        return answer;
    }
}
