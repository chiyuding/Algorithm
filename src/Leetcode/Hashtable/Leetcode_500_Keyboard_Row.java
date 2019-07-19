package Leetcode.Hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Leetcode_500_Keyboard_Row {
    public static void main(String[] args){
        String[] words = {"ui", "Hjkd"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    private static String[] findWords(String[] words){
        ArrayList<String> res = new ArrayList<>();
        String s1 = "qwertyuiop" + "qwertyuiop".toUpperCase();
        String s2 = "asdfghjkl" + "asdfghjkl".toUpperCase();
        String s3 = "zxcvbnm" + "zxcvbnm".toUpperCase();
        String[] one = s1.split("");
        String[] two = s2.split("");
        String[] three = s3.split("");
        HashSet<String> first = new HashSet<String>(Arrays.asList(one));
        HashSet<String> second = new HashSet<>(Arrays.asList(two));
        HashSet<String> third = new HashSet<>(Arrays.asList(three));

        for(String word : words){
            boolean isValid = true;
            int i = 1;

            if(first.contains(String.valueOf(word.charAt(0)))){
                while(i < word.length()){
                    if(!first.contains(String.valueOf(word.charAt(i)))){
                        isValid = false;
                        break;
                    }
                    i++;
                }
            }else if(second.contains(String.valueOf(word.charAt(0)))){
                while(i < word.length()){
                    if(!second.contains(String.valueOf(word.charAt(i)))){
                        isValid = false;
                        break;
                    }
                    i++;
                }
            }else{
                while(i < word.length()){
                    if(!third.contains(String.valueOf(word.charAt(i)))){
                        isValid = false;
                        break;
                    }
                    i++;
                }
            }
            if(isValid){
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
