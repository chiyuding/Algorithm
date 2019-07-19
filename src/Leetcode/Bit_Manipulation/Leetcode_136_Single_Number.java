package Leetcode.Bit_Manipulation;

public class Leetcode_136_Single_Number {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
