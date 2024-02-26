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
        System.out.println(uea.numUniqueEmails(emails));
        System.out.println(uea.solve1(emails));
        System.out.println(uea.solve2(emails));
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

    public int solve1(String[] emails) {

        Set<String> set = new HashSet<String>();

        for(String email : emails){

            String localName = makeLocalName(email);
            String domainName = makeDomainName(email);

            set.add(localName + "@" + domainName);
        }

        return set.size();
    }

    public int solve2(String[] emails) {

        Set<String> set = new HashSet<String>();

        for(String email : emails){

            String[] parts = email.split("@");
            String[] localName = parts[0].split("\\+");
            set.add(localName[0].replace(".", "") + "@" + parts[1]);
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

            if(email.charAt(i) == '+' || email.charAt(i) == '+'){
                break;
            }

            sb.append(email.charAt(i));
        }

        return sb.toString();
    }
}
