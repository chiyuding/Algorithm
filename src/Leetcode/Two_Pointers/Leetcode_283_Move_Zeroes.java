package Leetcode.Two_Pointers;

import java.util.Arrays;

public class Leetcode_283_Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int write = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
                nums[write++] = nums[i];
        }
        for(int j = write; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}
