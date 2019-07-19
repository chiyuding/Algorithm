package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_448_Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int num : nums){
            if(nums[Math.abs(num) - 1] > 0)
            nums[Math.abs(num) - 1] = -nums[Math.abs(num) - 1];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                res.add(i + 1);
        }
        return res;
    }
}
