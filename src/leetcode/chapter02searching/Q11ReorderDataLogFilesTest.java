package leetcode.chapter02searching;

// 937. Reorder Data in Log Files
// https://leetcode.com/problems/reorder-data-in-log-files/description/
public class Q11ReorderDataLogFilesTest {

    public static void main(String[] args) {

        String[] logs = {
                "dig1 8 1 5 1",
                "let1 art can",
                "dig2 3 6",
                "let2 own kit dig",
                "let3 art zero"
        };

        Q11ReorderDataLogFilesTest question = new Q11ReorderDataLogFilesTest();
        print(question.reorderLogFiles(logs));
    }

    public String[] reorderLogFiles(String[] logs) {

        return null;
    }

    public static void print(String[] logs) {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
