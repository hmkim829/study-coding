package leetcode.easy;

// 1108. Defanging an IP Address
// https://leetcode.com/problems/defanging-an-ip-address/
public class Solution1108 {
    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        for(char ch : address.toCharArray()){
            if(ch == '.'){
                sb.append("[.]");
            }else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String address = "1.1.1.1";

        Solution1108 sol = new Solution1108();
        System.out.println(sol.defangIPaddr(address));
    }
}
