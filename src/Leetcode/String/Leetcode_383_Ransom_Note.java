package Leetcode.String;

import java.util.Hashtable;
import java.util.Map;

public class Leetcode_383_Ransom_Note {
    public static void main(String[] args){
        String ransomNote = "aaa",  magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        boolean isConstructable = true;
        Hashtable<Character, Integer> cnt_magazine = new Hashtable<>();
        Hashtable<Character, Integer> cnt_ransomNote = new Hashtable<>();
        for(int i = 0; i < magazine.length(); i++){
            char lr = magazine.charAt(i);
            int count = cnt_magazine.containsKey(lr) ? cnt_magazine.get(lr) : 0;
            cnt_magazine.put(lr, count + 1);
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char lr = ransomNote.charAt(i);
            int count = cnt_ransomNote.containsKey(lr) ? cnt_ransomNote.get(lr) : 0;
            cnt_ransomNote.put(lr, count + 1);
        }
        for(Map.Entry<Character, Integer> entry : cnt_ransomNote.entrySet()){
            if(!(cnt_magazine.containsKey(entry.getKey()) && cnt_magazine.get(entry.getKey()) >= entry.getValue())){
                isConstructable = false;
                break;
            }
        }

        return isConstructable;
    }
}
