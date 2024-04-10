package leetcode.chapter02searching;


// 사람들이 회의를 모두 참석하려면 몇개의 회의실이 필요한가?
public class Q09MeetingRoom2 {

    public static void main(String[] args) {

        int[][] intervals = {{5,10}, {16,20}, {0,30}}; // 2
        int[][] intervals2 = {{6,10}, {1,3}}; // 1

        Q08MeetingRoom question = new Q08MeetingRoom();
        System.out.println(question.solve(intervals));
        System.out.println(question.solve(intervals2));
    }

    public int solve(int[][] intervals) {
        return 0;
    }
}
