package leetcode;

// 1281. Subtract the Product and Sum of Digits of an Integer
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class Solution1281 {
    public int subtractProductAndSum(int n) {

//        String str = String.valueOf(n);
//        int sum = 0;
//        int product = 1;
//
//        for(int i=0;i<str.length();i++) {
//            int num = Integer.parseInt(str.charAt(i)+"");
//            sum += num;
//            product *= num;
//        }
//
//        return product - sum;

        int sum = 0;
        int product = 1;

        while(n > 0){

            sum += n%10;
            product *= n%10;
            n /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {

        int n = 234;

        Solution1281 sol = new Solution1281();
        System.out.println(sol.subtractProductAndSum(n));
    }
}
