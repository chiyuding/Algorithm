package Leetcode.Bit_Manipulation;

public class Leetcode_389_Find_the_Difference {
    public static void main(String[] args) {
        String s = "sy",  t = "syy";
        System.out.println(findTheDifference(s, t));
    }

    private static char findTheDifference(String s, String t) {
        int one = 0, two = 0, k = 0;
        for(int i = 0; i < s.length(); i++)
            one ^= 1 << s.charAt(i) - 'a';
        for(int j = 0; j < t.length(); j++)
            two ^= 1 << t.charAt(j) - 'a';
        while(one > 0 || two > 0){
            int i = one & 1, j = two & 1;
            if(i != j) break;
            k++;
            one >>= 1; two >>= 1;
        }
        return (char)('a' + k);
    }
}
