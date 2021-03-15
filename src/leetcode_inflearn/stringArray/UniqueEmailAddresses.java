package leetcode_inflearn.stringArray;

import java.util.HashSet;
import java.util.Set;

// 929. Unique Email Addresses
// https://leetcode.com/problems/unique-email-addresses/
public class UniqueEmailAddresses {

    public static void main(String[] args) {

//        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//        String[] emails = {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        String[] emails = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};

        UniqueEmailAddresses uea = new UniqueEmailAddresses();
        System.out.println(uea.numUniqueEmails(emails));
    }

    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<String>();

        for(String email : emails){

            String[] tmp = email.split("@");

            String local = tmp[0].replace(".", "");

            if(local.indexOf("+") > 0)
                local = local.substring(0, local.indexOf("+"));

            set.add(local+ "@" +tmp[1]);
        }

        return set.size();
    }
}
