package Leetcode.Binary_Search;

public class Leetcode_74_Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,  3,  5,  7},
                          {10, 11, 16, 20},
                          {23, 30, 34, 50}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
     private static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) //.length!
            return false;
        int row = matrix.length, col = matrix[0].length;
        int lo = 0, hi = row * col - 1;  // \t!
        int mid, r, c;
        while(lo < hi){
            mid = lo + (hi - lo) / 2;
            r = mid / col;
            c = mid % col;
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        r = lo / col;
        c = lo % col;
        return matrix[r][c] == target;
     }
}
