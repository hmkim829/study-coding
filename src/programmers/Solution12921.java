package programmers;

// 소수 찾기
// https://programmers.co.kr/learn/courses/30/lessons/12921
// 에라토스테네스의 체 (Sieve of Eratosthenes)
public class Solution12921 {

    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[n+1];
        for(int i=2;i<arr.length;i++){
            arr[i] = i;
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i] == 0) {
                continue;
            }

            for(int j=i+i;j<arr.length;j+=i){
                if(arr[j]%i == 0){
                    arr[j] = 0;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution12921 sol = new Solution12921();

        int n = 10;

        System.out.println(sol.solution(n));
    }
}
