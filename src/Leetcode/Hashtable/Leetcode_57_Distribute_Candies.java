package Leetcode.Hashtable;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode_57_Distribute_Candies {
    public static void main(String[] args) {
        int[] candies = {1, 1, 2, 3};
        System.out.println(distributeCandies(candies));
    }

    private static int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : candies){
            set.add(i);
        }
        return Integer.min(set.size(), candies.length / 2);
    }
}
