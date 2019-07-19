package Leetcode.Array;

        import java.util.Arrays;

public class Leetcode_561_Array_Partition_I {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }

    private static int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i += 2){
            res += nums[i];
        }
        return res;
    }
}
