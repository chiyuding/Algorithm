package Leetcode.String;

import java.util.ArrayList;

public class Leetcode_696_Count_Binary_Substrings {
    public static void main(String[] args) {
        String s = "00";
        System.out.println(countBinarySubstrings(s));
    }

    private static int countBinarySubstrings(String s) {
        ArrayList<Integer> nums = new ArrayList<>();
        int start_ind = 0;
        int i = 1, ans = 0;
        while(i < s.length()){
            if(!(s.charAt(i) == s.charAt(start_ind))){
                nums.add(i - start_ind);
                start_ind = i;
            }
            i++;
        }
        nums.add(i - start_ind);
        for(int j = 1; j < nums.size(); j++){
            ans += Integer.min(nums.get(j - 1), nums.get(j));
        }
        return ans;
    }
}
