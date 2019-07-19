package Leetcode.Array;

public class Leetcode_485_Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int longestOnes = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 0){
                i++;
                continue;
            }
            int cnt = 1;
            while(++i < nums.length){
                if(nums[i] == 1)
                    cnt++;
                else
                    break;
            }
            longestOnes = cnt > longestOnes ? cnt : longestOnes;
        }
        return longestOnes;
    }
}
