package leetcode.chapter01string;

import java.util.HashSet;
import java.util.Set;

// 929. Unique Email Addresses
// https://leetcode.com/problems/unique-email-addresses/
public class Q01UniqueEmailAddresses {

    public static void main(String[] args) {

//        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//        String[] emails = {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
        String[] emails = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};

        Q01UniqueEmailAddresses uea = new Q01UniqueEmailAddresses();
        System.out.println(uea.solve(emails));
    }

    public int solve(String[] emails) {

        Set<String> set = new HashSet<>();

        for(String email : emails){
            String localName = makeLocalName(email);
            String domainName = makeDomainName(email);

            set.add(localName + "@" + domainName);
        }

        return set.size();
    }

    private String makeDomainName(String email) {
        return email.substring(email.indexOf("@"));
    }

    private String makeLocalName(String email) {

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<email.length();i++){

            if(email.charAt(i) == '.'){
                continue;
            }

            if(email.charAt(i) == '+'){
                break;
            }

            sb.append(email.charAt(i));
        }

        return sb.toString();
    }
}
