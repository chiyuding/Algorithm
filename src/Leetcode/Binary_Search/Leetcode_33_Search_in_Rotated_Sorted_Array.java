package Leetcode.Binary_Search;

public class Leetcode_33_Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1};
        int target = 1;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        int lo = 0, hi = nums.length - 1;
        int mid;
        while(lo < hi){
            mid = lo + (hi - lo) / 2;
            if(nums[lo] <= nums[mid]){
                if(target > nums[mid] || target < nums[lo])
                    lo = mid + 1;
                else
                    hi = mid;
            }else{
                if(nums[mid] < target && target < nums[lo])
                    lo = mid + 1;
                else
                    hi = mid;
            }
        }
        return nums[lo] == target ? lo : -1;
    }
}
