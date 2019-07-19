package Leetcode.Array;

import java.util.Arrays;

public class Leetcode_922_Sort_Array_By_Parity_II {
    public static void main(String[] args){
        int[] A = {1,5,4,6};
        System.out.println(Arrays.toString(sortArrayByParityII(A)));
    }
    private static int[] sortArrayByParityII(int[] A) {
        int odd_index = 1;
        for(int even_index = 0; even_index < A.length; even_index += 2){
            if(A[even_index] % 2 == 1){
                while(odd_index < A.length && A[odd_index] % 2 == 1){
                    odd_index += 2;
                }
                if(odd_index < A.length){
                    int temp = A[even_index];
                    A[even_index] = A[odd_index];
                    A[odd_index] = temp;
                }
            }
        }
        return A;
    }
}
