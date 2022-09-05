package leetcode.graph;

// 200. Number of Islands
// https://leetcode.com/problems/number-of-islands/
public class NumberOfIsland_dfs {

    public static void main(String[] args) {

        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        NumberOfIsland_dfs sol = new NumberOfIsland_dfs();
        System.out.println(sol.numsIslands(grid));
    }

    public int numsIslands(char[][] grid) {

        int result = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1') {
                    result++;
                    dfs(i, j, grid);
                }
            }
        }
        return result;
    }

    public void dfs(int i, int j, char[][] grid){

        if( i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }

        grid[i][j] = 'X';

        dfs(i-1, j, grid);
        dfs(i, j+1, grid);
        dfs(i, j-1, grid);
        dfs(i+1, j, grid);
    }
}
