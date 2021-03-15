package leetcode_inflearn.linkedList;

import util.ListNode;

// 2. Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers{

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers sol = new AddTwoNumbers();
        print(sol.solve(l1, l2));
    }

    public ListNode solve(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = l3;
        int carry = 0;

        while(p1 != null || p2 != null){

            if(p1 != null){
                carry += p1.val;
                p1 = p1.next;
            }

            if(p2 != null){
                carry += p2.val;
                p2 = p2.next;
            }

            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }

        if(carry > 0){
            p3.next = new ListNode(carry);
        }

        return l3.next;
    }

    private static void print(ListNode solve) {

        while(solve != null){
            System.out.println(solve.val);
            solve = solve.next;
        }
    }
}
