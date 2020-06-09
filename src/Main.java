import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception{

        System.setIn(new FileInputStream("sample.txt"));
        Scanner sc = new Scanner(System.in);

        int testCase = Integer.parseInt(sc.nextLine());

        for(int k=0;k<testCase;k++){

            String txt = sc.nextLine() + "\n";
            Stack<Character> st = new Stack<Character>();

            for(int i=0;i<txt.length();i++){

                if(txt.charAt(i) == ' ' || txt.charAt(i) == '\n'){

                    while(!st.empty()){
                        System.out.print(st.pop());
                    }
                    System.out.print(txt.charAt(i));
                }else{
                    st.push(txt.charAt(i));
                }
            }
        }
    }
}
