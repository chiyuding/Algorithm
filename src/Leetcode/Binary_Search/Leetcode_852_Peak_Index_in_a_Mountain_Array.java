package Leetcode.Binary_Search;

public class Leetcode_852_Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int[] A = {0, 1, 3, 2, 0};
        System.out.println(peakIndexInMountainArray(A));
    }

    private static int peakIndexInMountainArray(int[] A) {
        int lo = 1, hi = A.length - 2;
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if(A[mid] > A[mid - 1] && A[mid + 1] > A[mid])
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }
}
