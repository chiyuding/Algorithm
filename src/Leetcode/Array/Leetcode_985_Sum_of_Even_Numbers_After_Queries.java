package Leetcode.Array;

import java.util.Arrays;

public class Leetcode_985_Sum_of_Even_Numbers_After_Queries {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0},{-3, 1},{-4, 0},{2, 3}};
        System.out.println(Arrays.toString(sumEvenAfterQueries(A, queries)));
    }

    private static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        int[] res = new int[queries.length];
        for(int num : A){
            if(num % 2 == 0){
                sum += num;
            }
        }
        for(int i = 0; i < queries.length; i++){
            if(A[queries[i][1]] % 2 == 0){
                if(queries[i][0] % 2 == 0){
                    sum += queries[i][0];
                }else{
                    sum -= A[queries[i][1]];
                }
            }else{
                if(!(queries[i][0] % 2 == 0)){ // negative numbers!!!
                    sum += (A[queries[i][1]] + queries[i][0]);
                }
            }
            A[queries[i][1]] += queries[i][0];
            res[i] = sum;
        }
        return res;
    }
}
