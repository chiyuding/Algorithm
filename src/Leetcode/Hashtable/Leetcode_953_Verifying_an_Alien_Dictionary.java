package Leetcode.Hashtable;

import java.util.HashMap;

public class Leetcode_953_Verifying_an_Alien_Dictionary {
    public static void main(String[] args) {
        String[] words = {"zirqhpfscx","zrmvtxgelh","vokopzrtc","nugfyso","rzdmvyf","vhvqzkfqis","dvbkppw","ttfwryy","dodpbbkp","akycwwcdog"};
        String order = "khjzlicrmunogwbpqdetasyfvx";
        System.out.println(isAlienSorted(words, order));
    }

    private static boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Character> relationship = new HashMap<>();
        String prev = null;
        for(int i = 0; i < 26; i++)
            relationship.put(order.charAt(i), (char)('a' + i));
        for(String word : words){
            StringBuilder temp = new StringBuilder();
            for(int i = 0; i < word.length(); i++)
                temp.append(relationship.get(word.charAt(i)));
            String cur = temp.toString();
            if(prev == null) //Strings.isNullOrEmpty()
                prev = cur;
            else{
                if(cur.compareTo(prev) < 0)
                    return false;
                else
                    prev = cur;
            }
        }
        return true;
    }
}
