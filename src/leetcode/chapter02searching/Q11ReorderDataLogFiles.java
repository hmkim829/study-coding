package leetcode.chapter02searching;

import java.util.Arrays;

// 937. Reorder Data in Log Files
// https://leetcode.com/problems/reorder-data-in-log-files/description/
public class Q11ReorderDataLogFiles {

    public static void main(String[] args) {

        String[] logs = {
                "dig1 8 1 5 1",
                "let1 art can",
                "dig2 3 6",
                "let2 own kit dig",
                "let3 art zero"
        };

        Q11ReorderDataLogFiles question = new Q11ReorderDataLogFiles();
        print(question.reorderLogFiles(logs));
    }

    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (a, b) -> {

            String[] splitA = a.split(" ", 2);
            String[] splitB = b.split(" ", 2);

            boolean isDigitA = Character.isDigit(splitA[1].charAt(0));
            boolean isDigitB = Character.isDigit(splitB[1].charAt(0));

            if(isDigitA && isDigitB) { // 숫자, 숫자 -> 그대로
                return 0;
            } else if(isDigitA && !isDigitB) { // 숫자, 문자 -> 내림
                return 1;
            } else if(!isDigitA && isDigitB) { // 문자, 숫자
                return -1;
            } else { // 문자, 문자
                int compare = splitA[1].compareTo(splitB[1]);
                if(compare == 0) {
                    return splitA[0].compareTo(splitB[0]);
                }else{
                    return compare;
                }
            }
        });

        return logs;
    }

    public static void print(String[] logs) {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
