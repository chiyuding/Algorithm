package Leetcode.Bit_Manipulation;

import java.util.Arrays;

public class Leetcode_169_Majority_Element {
    public static void main(String[] args) {
        int[] nums = {-2147483648};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        // method two: bit manipulation
        int[] bits = new int[32];
        int res = 0;
        for(int num : nums)
            for(int i = 0; i < 32; i++)
                if((num & (1 << i)) != 0)
                    bits[i]++;
        // System.out.println(Arrays.toString(bits));
        for(int j = 0; j < 32; j++)
            if(bits[j] > nums.length / 2)
                res += 1 << j;
        return res;




        // method one: moore voting
        /*int cand = nums[0];
        int cnt = 0;
        for(int num : nums){
            if(num == cand)
                cnt++;
            else{
                if(cnt == 0)
                    cand = num;
                else
                    cnt--;
            }
        }
        return cand;*/

    }
}
