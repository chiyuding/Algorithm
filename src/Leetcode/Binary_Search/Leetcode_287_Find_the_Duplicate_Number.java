package Leetcode.Binary_Search;

public class Leetcode_287_Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        int lo = 1, hi = nums.length - 1;
        int mid;
        int cnt = 0;
        while(lo < hi){
            mid = lo + (hi - lo) / 2;
            for(int i : nums){
                if(i <= mid)
                    cnt++;
            }
            if(cnt <= mid)
                lo = mid + 1;
            else
                hi = mid;
            cnt = 0;
        }
        return lo;
    }
}
