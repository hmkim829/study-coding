package leetcode_inflearn.dynamic;

// 62. Unique Paths
// https://leetcode.com/problems/unique-paths/
public class UniquePath {

    public static void main(String[] args) {
        int m = 3, n = 7;
        UniquePath prob = new UniquePath();
        System.out.println(prob.uniquePaths(m,n));
    }

    public int uniquePaths(int m, int n) {
        int[][] path = new int[m][n];

        for(int i=0;i<m;i++)
            path[i][0] = 1;

        for(int i=0;i<n;i++)
            path[0][i] = 1;

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                path[i][j] = path[i][j-1] + path[i-1][j];
            }
        }
        return path[m-1][n-1];
    }
}
