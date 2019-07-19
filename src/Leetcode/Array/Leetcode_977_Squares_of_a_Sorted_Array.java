package Leetcode.Array;

import java.util.Arrays;

public class Leetcode_977_Squares_of_a_Sorted_Array {
    public static void main(String[] args){
        int[] A = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(A)));
    }

    private static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int l = 0;
        int r = A.length - 1;
        int write = A.length - 1;
        while(l <= r){
            int temp1 = A[l] * A[l];
            int temp2 = A[r] * A[r];
            if(temp1 >= temp2){
                res[write] = temp1;
                l++;
            }else{
                res[write] = temp2;
                r--;
            }
            write--;
        }
        return res;

    }
}
