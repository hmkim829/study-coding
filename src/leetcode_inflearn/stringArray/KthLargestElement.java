package leetcode_inflearn.stringArray;

import java.util.*;

// 215. Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/
public class KthLargestElement {

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        KthLargestElement sol = new KthLargestElement();
        System.out.println(sol.findKthLargest(nums, k));
        System.out.println(sol.findKthLargest2(nums, k));
    }

    public int findKthLargest(int[] nums, int k) {

        Queue<Integer> queue = new PriorityQueue<>(nums.length, (a,b)->a-b);

        for(int i=0;i<nums.length;i++){
            queue.offer(nums[i]);
            if(queue.size() > k) queue.poll();
        }

        return queue.peek();
    }

    public int findKthLargest2(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
