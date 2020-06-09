import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Main9012 {

    public static void main(String[] args) throws Exception{

        System.setIn(new FileInputStream("sample.txt"));
        Scanner sc = new Scanner(System.in);

        int testCase = Integer.parseInt(sc.nextLine());

        for(int t=0;t<testCase;t++){

            String str = sc.nextLine();
            System.out.println(valid(str));
        }
    }

    public static String valid(String str){

        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            }else{
                if(!st.empty()){
                    st.pop();
                }else{
                    return "NO";
                }
            }
        }

        if(st.empty()){
            return "YES";
        }else{
            return "NO";
        }
    }
}
