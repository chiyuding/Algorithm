package Leetcode.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.StringJoiner;

public class Leetcode_824_Goat_Latin {
    public static void main(String[] args) {
        String S = "I speak Goat Latin";
        System.out.println(toGoatLatin(S));
    }

    private static String toGoatLatin(String S) {
        String v = "aeiou" + "aeiou".toUpperCase();
        String[] v_splited = v.split("");
        HashSet<String> vowel = new HashSet<>(Arrays.asList(v_splited));
        String[] splited = S.split(" ");
        StringJoiner res = new StringJoiner(" ");
        for(int i = 0; i < splited.length; i++){
            StringBuilder temp = new StringBuilder();
            if(vowel.contains(String.valueOf(splited[i].charAt(0)))){ //String.valueOf()!!!
                temp.append(splited[i]);
            }else{
                temp.append(splited[i].substring(1));
                temp.append(splited[i].charAt(0));
            }
            temp.append("ma");
            int j = 0;
            while(j++ < i + 1){
                temp.append('a');
            }
            res.add(temp);
        }
        return res.toString();
    }
}
