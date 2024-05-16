package leetcode.chapter07graph;

import java.util.LinkedList;
import java.util.Queue;

// 200. Number of Islands
// https://leetcode.com/problems/number-of-islands/
public class NumberOfIslandBfs {
    public static void main(String[] args) {

        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        NumberOfIslandBfs sol = new NumberOfIslandBfs();
        System.out.println(sol.numsIslands(grid));
    }

    public int numsIslands(char[][] grid) {

        int count = 0;

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }

        return count;
    }

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private void bfs(char[][] grid, int x, int y) {
        grid[x][y] = 'X';
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int[] dir : dirs) {
                int x1 = poll[0] + dir[0];
                int y1 = poll[1] + dir[1];

                if(x1 >= 0 && x1 < grid.length && y1 >= 0 && y1 < grid[x1].length && grid[x1][y1] == '1') {
                    grid[x1][y1] = 'X';
                    queue.offer(new int[]{x1, y1});
                }
            }
        }
    }
}
