package leetcode_inflearn;

import java.util.ArrayList;
import java.util.List;

// 54. Spiral Matrix
// https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {  { 1, 2, 3 },
                            { 4, 5, 6 },
                            { 7, 8, 9 } };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;

        while(rowStart <= rowEnd && colStart <= colEnd){

            //right
            for(int i=colStart;i<=colEnd;i++){
                list.add(matrix[rowStart][i]);
            }
            rowStart++;

            //down
            for(int i=rowStart;i<=rowEnd;i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            //left
            if(rowStart <= rowEnd)
            for(int i=colEnd;i>=colStart;i--){
                list.add(matrix[rowEnd][i]);
            }
            rowEnd--;

            //up
            if(colStart <= colEnd)
            for(int i=rowEnd;i>=rowStart;i--){
                list.add(matrix[i][colStart]);
            }
            colStart++;

        }
        return list;
    }
}
