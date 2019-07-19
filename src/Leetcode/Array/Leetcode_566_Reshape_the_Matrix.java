package Leetcode.Array;

import java.util.Arrays;

public class Leetcode_566_Reshape_the_Matrix {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(nums, r, c)));
    }

    private static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length, col = nums[0].length;
        if(row * col != r * c)
            return nums;
        int[][] res = new int[r][c];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                int index = i * col + j;
                int new_row = index / c, new_col = index % c;
                res[new_row][new_col] = nums[i][j];
            }
        }
        return res;
    }

}
