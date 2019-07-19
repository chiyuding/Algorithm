package Leetcode.String;

public class Leetcode_521_Longest_Uncommon_Subsequence_I {
    public static void main(String[] args) {
        String a = "aba", b = "cdc";
        System.out.println(findLUSlength(a, b));
    }

    private static int findLUSlength(String a, String b) {
        int res = -1;
        if(!a.equals(b)){
            res = Integer.max(a.length(), b.length());
        }
        return res;
    }
}
