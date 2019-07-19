package Leetcode.Binary_Search;

public class Leetcode_53_Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int mid;
        while(lo < hi){
            if(nums[lo] <= nums[hi])
                return nums[lo];
            mid = lo + (hi - lo) / 2;
            if(nums[lo] <= nums[mid])
                lo = mid + 1;
            else
                hi = mid;
        }
        return nums[lo];
    }
}
