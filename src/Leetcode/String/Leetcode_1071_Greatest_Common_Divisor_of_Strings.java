package Leetcode.String;

import java.util.HashSet;

public class Leetcode_1071_Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {
        String str1 = "ABABAB", str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));
    }

    private static String gcdOfStrings(String str1, String str2){
        int l1 = str1.length(), l2 = str2.length();
        for(int l = Integer.min(l1, l2); l > 0; l--){
            if(!(l1 % l == 0 && l2 % l == 0))
                continue;
            HashSet<String> s1 = new HashSet<>();
            HashSet<String> s2 = new HashSet<>();
            for(int i = 0; i < l1; i += l){
                String temp1 = str1.substring(i, i + l);
                s1.add(temp1);
            }
            for(int j = 0; j < l2; j += l){
                String temp2 = str2.substring(j, j + l);
                s2.add(temp2);
            }
            if(s1.size() == 1 && s2.size() == 1){
                if(str1.substring(0, l).equals(str2.substring(0, l)))
                    return str1.substring(0, l);
            }
        }
        return "";
    }
}
