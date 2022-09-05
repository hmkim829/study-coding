package leetcode.linkedList;

import util.ListNode;

import java.util.PriorityQueue;

// 23. Merge k Sorted Lists
// https://leetcode.com/problems/merge-k-sorted-lists/
public class MergeKSortedList {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode[] lists = {l1, l2, l3};
        MergeKSortedList sol = new MergeKSortedList();
        print(sol.mergeKLists(lists));
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode node : lists){
            if(node != null)
                queue.offer(node);
        }

        ListNode l4 = new ListNode(0);
        ListNode cloneNode = l4;
        while(!queue.isEmpty()){
            ListNode node = queue.poll();
            cloneNode.next = node;
            cloneNode = cloneNode.next;
            if(node.next != null){
                queue.offer(node.next);
            }
        }

        return l4.next;
    }

    private static void print(ListNode solve) {

        while(solve != null){
            System.out.println(solve.val);
            solve = solve.next;
        }
    }
}
