package Leetcode.Array;

public class Leetcode_665_Non_decreasing_Array {
    public static void main(String[] args) {
        int[] nums = {4, 2, 1};
        System.out.println(checkPossibility(nums));
    }

    private static boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                cnt++;
                if(cnt > 1 || ((i > 0 && nums[i - 1] > nums[i + 1]) && (i + 2 < nums.length && nums[i] > nums[i + 2])))
                    return false;
            }
        }
        return true;
    }
}
