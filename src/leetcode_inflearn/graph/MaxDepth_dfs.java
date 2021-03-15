package leetcode_inflearn.graph;

import util.TreeNode;

import java.util.Stack;

// 104. Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepth_dfs {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxDepth_dfs sol = new MaxDepth_dfs();
        System.out.println(sol.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> valStack = new Stack<>();
        stack.push(root);
        valStack.push(1);
        int max = 0;

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            int count = valStack.pop();
            max = Math.max(max,count);

            if(node.left != null){
                stack.push(node.left);
                valStack.push(1+count);
            }

            if(node.right != null){
                stack.push(node.right);
                valStack.push(1+count);
            }
        }

        return max;
    }
}
