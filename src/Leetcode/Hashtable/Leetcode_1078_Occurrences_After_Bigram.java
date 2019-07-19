package Leetcode.Hashtable;

import java.util.ArrayList;

public class Leetcode_1078_Occurrences_After_Bigram {
    public static void main(String[] args){
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
        String[] words = findOcurrences(text, first, second);
        for(String word : words){
            System.out.println(word);
        }

    }

    private static String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(first)){
                if(i + 1 < words.length && words[i + 1].equals(second)) {
                    if(i + 2 < words.length){
                        ans.add(words[i + 2]);
                    }
                }
            }
        }
        String[] res = ans.toArray(new String[ans.size()]);
        return res;
    }
}
