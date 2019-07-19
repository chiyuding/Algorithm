package Leetcode.Hashtable;

import java.util.HashSet;

public class Leetcode_217_Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
