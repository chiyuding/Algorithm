package Leetcode.String;

import java.util.Arrays;

public class Leetcode_344_Reverse_String {
    public static void main(String[] args){
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    private static void reverseString(char[] s){
        for(int i = 0; i < s.length / 2; i++){
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
