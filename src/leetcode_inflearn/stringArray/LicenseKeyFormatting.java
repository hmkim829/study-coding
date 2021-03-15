package leetcode_inflearn.stringArray;

//482. License Key Formatting
//https://leetcode.com/problems/license-key-formatting/
public class LicenseKeyFormatting {

    public static void main(String[] args) {

//        String S = "5F3Z-2e-9-w";
//        String S = "2-4A0r7-4k";
        String S = "2-5g-3-J";
        int K = 2;


        LicenseKeyFormatting license = new LicenseKeyFormatting();
        System.out.println(license.licenseKeyFormatting(S,K));
    }

    public String licenseKeyFormatting(String S, int K) {

//        StringBuilder reminder = new StringBuilder(S.replaceAll("-", "").toUpperCase());
//        System.out.println(reminder);
//
//        Stack<String> st = new Stack<String>();
//
//        while (reminder.length() >= K) {
//            st.add(reminder.substring(reminder.length()-K, reminder.length()));
//            reminder.replace(reminder.length()-K, reminder.length(), "");
//        }
//
//        if(reminder.length() > 0){
//            st.add(reminder.toString());
//        }
//
//        StringBuilder result = new StringBuilder();
//        while(!st.isEmpty()){
//            if(result.length() != 0) result.append("-");
//            result.append(st.pop());
//        }

        StringBuilder result = new StringBuilder(S.replaceAll("-", "").toUpperCase());
        System.out.println(result);

        int len = result.length();
        for(int i=len-K;i>0;i-=K){
            result.insert(i,'-');
        }

        return result.toString();
    }
}
