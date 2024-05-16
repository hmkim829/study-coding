package leetcode.chapter07graph;

// 200. Number of Islands
// https://leetcode.com/problems/number-of-islands/
public class NumberOfIslandDfsTest {

    public static void main(String[] args) {

        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        NumberOfIslandDfsTest sol = new NumberOfIslandDfsTest();
        System.out.println(sol.numsIslands(grid));
    }

    public int numsIslands(char[][] grid) {

        return 0;
    }
}
