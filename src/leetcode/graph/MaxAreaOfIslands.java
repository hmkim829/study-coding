package leetcode.graph;

// 695. Max Area of Island
// https://leetcode.com/problems/max-area-of-island/
public class MaxAreaOfIslands {

    public static void main(String[] args) {
        int[][] grid = {
            {1,1,0,0,0},
            {1,1,0,0,0},
            {0,0,0,1,1},
            {0,0,0,1,1}
        };

        MaxAreaOfIslands prob = new MaxAreaOfIslands();
        System.out.println(prob.maxAreaOfIsland(grid));
    }

    int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    int m,n;

    public int maxAreaOfIsland(int[][] grid) {

        int max = 0;
        m = grid.length;
        n = grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    int area = island(grid, i, j, 0);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    private int island(int[][] grid, int x, int y, int area) {

        if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0){
            return area;
        }

        grid[x][y] = 0;
        area++;

        for(int[] dir : dirs){
            area = island(grid, x+dir[0], y+dir[1], area);
        }
        return area;
    }
}
