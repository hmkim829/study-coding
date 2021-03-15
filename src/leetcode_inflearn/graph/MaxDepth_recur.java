package leetcode_inflearn.graph;

import util.TreeNode;

// 104. Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepth_recur {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxDepth_recur sol = new MaxDepth_recur();
        System.out.println(sol.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        return Math.max(leftMax, rightMax)+1;
    }
}
