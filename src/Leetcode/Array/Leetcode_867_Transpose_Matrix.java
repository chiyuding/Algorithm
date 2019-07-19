package Leetcode.Array;

import java.util.Arrays;

public class Leetcode_867_Transpose_Matrix {
    public static void main(String[] args){
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose(A)));
    }

    private static int[][] transpose(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] res = new int[col][row];
        for(int j = 0; j < col; j++){
            for(int i = 0; i < row; i++){
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}
