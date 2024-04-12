package leetcode.chapter03array;

// 42. Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/
public class Q15TrappingRainWater {

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Q15TrappingRainWater sol = new Q15TrappingRainWater();
        System.out.println(sol.trap(height));
    }

    public int trap(int[] height) {

        int result = 0;

        int[] left = new int[height.length];
        int[] right = new int[height.length];

        // left
        int max = Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            if(max < height[i]){
                left[i] = height[i];
                max = height[i];
            }else{
                left[i] = max;
            }
        }

        // right
        max = Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--){
            if(max < height[i]){
                right[i] = height[i];
                max = height[i];
            }else{
                right[i] = max;
            }
        }

        for(int i=0;i<height.length;i++){
            result += Math.min(left[i], right[i]) - height[i];
        }

        return result;
    }
}
