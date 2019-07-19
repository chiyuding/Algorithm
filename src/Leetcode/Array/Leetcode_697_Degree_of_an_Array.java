package Leetcode.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode_697_Degree_of_an_Array {
    public static void main(String[] args) {
        int[] nums = {2,1,1,2,1,3,3,3,1,3,1,3,2};
        System.out.println(findShortestSubArray(nums));
    }

    private static int findShortestSubArray(int[] nums) {
        int degree = 1, min_length = nums.length;
        HashMap<Integer, ArrayList<Integer>> index = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!index.containsKey(nums[i]))
                index.put(nums[i], new ArrayList<>());
            index.get(nums[i]).add(i);
            degree = Math.max(index.get(nums[i]).size(), degree);
        }
        for(int num : index.keySet()){
            if(index.get(num).size() == degree){
                ArrayList<Integer> value = index.get(num);
                min_length = Math.min(value.get(value.size() - 1) - value.get(0) + 1, min_length);
            }
        }
        return min_length;
    }
}
