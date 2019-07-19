package Leetcode.String;

public class Leetcode_557_Reverse_Words_in_a_String_III {
    public static void main(String[] args){
        String s = "Let's take LeetCode contest!";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] splited = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : splited){
            StringBuilder str = new StringBuilder(word);
            res.append(str.reverse());
            res.append(' ');
        }
        return res.toString().trim();

    }
}
