package Leetcode.Array;

import java.util.Arrays;

public class Leetcode_905_Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
    }

    private static int[] sortArrayByParity(int[] A) {
        int l = 0;
        int r = A.length - 1;
        while(l < r){
            if(A[l] % 2 == 1){
                while(r >= 0 && A[r] % 2 == 1){
                    r--;
                }
                if(r <= l){
                    break;
                }
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;
                r--;
            }
            l++;
        }
        return A;

    }
}
