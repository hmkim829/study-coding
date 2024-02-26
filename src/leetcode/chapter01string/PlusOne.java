package leetcode.chapter01string;

import java.util.Arrays;

// 66. Plus One
// https://leetcode.com/problems/plus-one/
public class PlusOne {

    public static void main(String[] args) {

//        int[] digits = {1,2,3};
        int[] digits = {9,9,9};

        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {

        int index = digits.length - 1;
        int carry = 1;

        while(index > -1 && carry > 0){
            digits[index] = (digits[index] + 1) % 10;
            if(digits[index] == 0){
                carry = 1;
            }else{
                carry = 0;
            }
            index--;
        }

        if(carry == 1){
            digits = new int[digits.length+1];
            digits[0] = 1;
        }

        return digits;
    }
}
