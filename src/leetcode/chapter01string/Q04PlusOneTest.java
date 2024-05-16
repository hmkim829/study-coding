package leetcode.chapter01string;

import java.util.Arrays;

// 66. Plus One
// https://leetcode.com/problems/plus-one/
public class Q04PlusOneTest {

    public static void main(String[] args) {

        int[] digits1 = {1,2,3};
        int[] digits2 = {9,9,9};
        int[] digits3 = {1,2,3};
        int[] digits4 = {9,9,9};
        int[] digits5 = {8,9,9,9};

        Q04PlusOneTest q04PlusOne = new Q04PlusOneTest();
        System.out.println(Arrays.toString(q04PlusOne.plusOne(digits1)));
        System.out.println(Arrays.toString(q04PlusOne.plusOne(digits2)));
        System.out.println(Arrays.toString(q04PlusOne.plusOne(digits3)));
        System.out.println(Arrays.toString(q04PlusOne.plusOne(digits4)));
        System.out.println(Arrays.toString(q04PlusOne.plusOne(digits5)));
    }

    public int[] plusOne(int[] digits) {

        return null;
    }
}
