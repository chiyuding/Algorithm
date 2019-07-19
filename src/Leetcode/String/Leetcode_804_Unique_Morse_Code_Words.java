package Leetcode.String;

import java.util.Hashtable;

public class Leetcode_804_Unique_Morse_Code_Words {
    public static void main(String[] args){
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    private static int uniqueMorseRepresentations(String[] words){
        Hashtable<String, Integer> cnt = new Hashtable<>();
        final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int ans = 0;
        for(String word : words){
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                temp.append(morse[word.charAt(i) - 'a']);
            }
            String str = temp.toString();
            if(cnt.containsKey(str)){
                cnt.put(str, cnt.get(str) + 1);
            }else{
                cnt.put(str, 1);
            }
            // System.out.println(cnt.toString());
        }

        ans = cnt.size();
        return ans;

    }
}
