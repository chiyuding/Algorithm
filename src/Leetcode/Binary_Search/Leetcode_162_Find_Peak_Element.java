package Leetcode.Binary_Search;

public class Leetcode_162_Find_Peak_Element {
    public static void main(String[] args) {
        int[] nums= {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));
    }

    private static int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int mid;
        while(lo < hi){
            mid = lo + (hi - lo) / 2;
            if(nums[mid] < nums[mid + 1])
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }

}
