package Leetcode.Binary_Search;

import java.util.Arrays;

public class Leetcode_34_Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 12;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int l1 = -1, h1 = nums.length - 1;
        int l2 = 0, h2 = nums.length;
        int mid1, mid2;
        while(l1 < h1){
           mid1 = l1 + (h1 - l1) / 2 + 1;
           if(nums[mid1] > target)
               h1 = mid1 - 1;
           else
               l1 = mid1;
        }

        while(l2 < h2){
            mid2 = l2 + (h2 - l2) / 2;
            if(nums[mid2] < target)
                l2 = mid2 + 1;
            else
                h2 = mid2;
        }
        if(h1 > -1 && nums[h1] == target)
            res[1] = h1;
        if(l2 < nums.length && nums[l2] == target)
            res[0] = l2;
        return res;
    }
}
