package leetcode_inflearn;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 104. Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepth_bfs {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxDepth_bfs sol = new MaxDepth_bfs();
        System.out.println(sol.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int count = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            count++;
        }

        return count;
    }
}
