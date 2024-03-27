package leetcode.chapter07graph;

// 79. Word Search
// https://leetcode.com/problems/word-search/
public class WordSearch {

    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";
        WordSearch prob = new WordSearch();
        System.out.println(prob.exist(board, word));
    }

    int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    int m,n;
    public boolean exist(char[][] board, String word) {

        if(board == null || board.length == 0 || board[0].length == 0)
            return false;

        m = board.length;
        n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board, visited, i, j, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] visited, int x, int y, int start, String word) {

        if(start == word.length()) return true;

        if(x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) return false;

        if(board[x][y] != word.charAt(start)) return false;

        visited[x][y] = true;
        for(int[] dir : dirs){
            if(dfs(board, visited, x+dir[0], y+dir[1], start+1, word)){
                return true;
            }
        }
        visited[x][y] = false;
        return false;
    }
}
