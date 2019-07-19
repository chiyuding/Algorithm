package Leetcode.Hashtable;

import java.util.Arrays;

public class Leetcode_242_Valid_Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        char[] arrays = s.toCharArray();
        char[] arrayt = t.toCharArray();
        Arrays.sort(arrays);
        Arrays.sort(arrayt);
        if(Arrays.equals(arrays, arrayt))
            return true;
        return false;
    }
}
