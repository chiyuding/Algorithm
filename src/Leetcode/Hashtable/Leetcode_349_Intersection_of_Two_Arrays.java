package Leetcode.Hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Leetcode_349_Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num1 : nums1)
            set1.add(num1);
        for(int num2 : nums2)
            set2.add(num2);
        ArrayList<Integer> res = new ArrayList<>();
        for(int num : set1){
            if(set2.contains(num))
                res.add(num);
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
            ans[i] = res.get(i);
        return ans;
    }
}
