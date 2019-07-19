package Leetcode.Array;

import java.util.Hashtable;

public class Leetcode_1051_Height_Checker {
    public static void main(String[] args){
        int[] heights = {1,2,2,2,2,2,1,2,2,1};
        System.out.println(heightChecker(heights));
    }
    private static int heightChecker(int[] heights){
        int[] cnt = new int[101];
        int invalid = 0;
        for(int num : heights){
            cnt[num]++;
        }

        Hashtable<Integer, int[]> pre_cnt = new Hashtable<>();
        int pre_sum = 0;
        for(int i = 1; i < cnt.length; i++){
            if(cnt[i] > 0){
                int[] interval = {pre_sum, pre_sum + cnt[i] - 1};
                pre_cnt.put(i, interval);
                pre_sum += cnt[i];
            }
        }

        for(int j = 0; j < heights.length; j++){
            int lower = pre_cnt.get(heights[j])[0], upper = pre_cnt.get(heights[j])[1];
            if(j < lower || j > upper){
                invalid++;
            }
        }
        return invalid;
    }
}
