package Leetcode.Array;

public class Leetcode_896_Monotonic_Array {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 3};
        System.out.println(isMonotonic(A));
    }

    private static boolean isMonotonic(int[] A) {
        boolean is_increase = false;
        boolean is_decrease = false;
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] < A[i + 1])
                is_increase = true;
            else if(A[i] > A[i + 1])
                is_decrease = true;
        }
        return !is_increase || !is_decrease;
    }
}
