package Leetcode.Array;

public class Leetcode_766_Toeplitz_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {2, 3}};
        System.out.println(isToeplitzMatrix(matrix));
    }

    private static boolean isToeplitzMatrix(int[][] matrix) {
        // boolean isToeplitz = true;
        for(int i = 0; i < matrix.length - 1; i++){
            for(int j = 0; j < matrix[0].length - 1; j++) {
                if(matrix[i][j] != matrix[i + 1][j + 1])
                    return false;
            }
        }
        return true;
    }
}
