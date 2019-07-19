package Leetcode.Array;

import java.util.Arrays;

public class Leetcode_832_Flipping_an_Image {
    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] B = {{1}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(B)));
    }

    private static int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        for (int i = 0; i < row; i++) {
            int j = 0;
            while (j < col / 2) {
                int temp = 1 - A[i][j];
                A[i][j] = 1 - A[i][col - 1 - j];
                A[i][col - 1 - j] = temp;
                j++;
            }
            if(col % 2 == 1){
                A[i][col / 2] = 1 -  A[i][col / 2];
                System.out.println(A[i][col / 2]);
            }
        }
        return A;
    }
}
