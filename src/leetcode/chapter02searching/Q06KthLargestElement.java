package leetcode.chapter02searching;

import java.util.*;

// 215. Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/
public class Q06KthLargestElement {

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        Q06KthLargestElement sol = new Q06KthLargestElement();
        System.out.println(sol.findKthLargest(nums, k));
    }

    public int findKthLargest(int[] nums, int k) {

        Queue<Integer> queue = new PriorityQueue<>();

        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) queue.poll();
        }

        return queue.peek();
    }
}
