package leetcode.chapter01string;

// 482. License Key Formatting
// https://leetcode.com/problems/license-key-formatting/
public class Q03LicenseKeyFormatting {

    public static void main(String[] args) {

//        String s = "5F3Z-2e-9-w";
//        String s = "2-4A0r7-4k";
        String s = "2-5g-3-J";
        int k = 2;

        Q03LicenseKeyFormatting license = new Q03LicenseKeyFormatting();
        System.out.println(license.licenseKeyFormatting(s,k));
    }

    public String licenseKeyFormatting(String s, int k) {

        StringBuilder result = new StringBuilder(s.replaceAll("-", "").toUpperCase());

        int length = result.length();
        for(int i=length-k;i>0;i-=k){
            result.insert(i,'-');
        }

        return result.toString();
    }
}
