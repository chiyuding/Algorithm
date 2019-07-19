package Leetcode.Array;

public class Leetcode_414_Third_Maximum_Number {
    public static void main(String[] args) {
      int[] nums = {2, 2, 3, 1};
      System.out.println(thirdMax(nums));
    }

    private static int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for(int num : nums){
            if(first < num){
                third = second;
                second = first;
                first = num;
            }else if(second < num && num < first ){
                third = second;
                second = num;
            }else if(third < num && num  < second){
                third = num;
            }
        }
        if(third != Long.MIN_VALUE){
            return (int)third;
        }
        return (int)first;
    }
}
