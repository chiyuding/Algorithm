package Leetcode.Binary_Search;

public class Leetcode_35_Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target  = 2;
        System.out.println(searchInsert(nums, target));

    }
    private static int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        int mid;
        while(lo < hi){
            mid = (lo + hi) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;

    }
}
