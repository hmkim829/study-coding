package beakjoon;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main1874 {

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("sample.txt"));
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int num = 1; // 스택에 들어가는 마지막 수
        Stack<Integer> st = new Stack<Integer>();
        List<String> answer = new ArrayList<String>();

        int[] seq = new int[n];
        int p = 0;

        for(int i=0;i<n;i++){
            seq[i] = Integer.parseInt(sc.nextLine());
        }

        for(int i=0;i<n;i++){

            st.push(num++);
            answer.add("+");

            while(!st.empty() && st.peek() == seq[p]){
                st.pop();
                answer.add("-");
                p++;
            }
        }

        if(st.empty()){
            for(String str : answer)
                System.out.println(str);
        }else{
            System.out.println("NO");
        }
    }
}
