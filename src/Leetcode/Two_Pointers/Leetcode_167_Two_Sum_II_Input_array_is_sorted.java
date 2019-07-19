package Leetcode.Two_Pointers;


import java.util.Arrays;

public class Leetcode_167_Two_Sum_II_Input_array_is_sorted {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    private static int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length - 1;
        int[] res = new int[2];
        while(lo < hi){
            int sum = numbers[lo] + numbers[hi];
            if(sum == target){
                res[0] = lo + 1;
                res[1] = hi + 1;
                break;
            }else if(sum < target)
                lo++;
            else
                hi--;
        }
        return res;
    }
}
