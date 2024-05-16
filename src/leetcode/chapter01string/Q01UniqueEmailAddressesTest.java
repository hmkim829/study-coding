package leetcode.chapter01string;

// 929. Unique Email Addresses
// https://leetcode.com/problems/unique-email-addresses/
public class Q01UniqueEmailAddressesTest {

    public static void main(String[] args) {

        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//        String[] emails = {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
//        String[] emails = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};

        Q01UniqueEmailAddressesTest uea = new Q01UniqueEmailAddressesTest();
        System.out.println(uea.numUniqueEmails(emails));
    }

    public int numUniqueEmails(String[] emails) {

        return 0;
    }
}
