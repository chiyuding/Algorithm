package Leetcode.Hashtable;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_748_Shortest_Completing_Word {
    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        String[] words = {"looks","pest","stew","show"};
        System.out.println(shortestCompletingWord(licensePlate, words));
    }

    private static String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isUpperCase(licensePlate.charAt(i))) {
                char lr = Character.toLowerCase(licensePlate.charAt(i));
                int value = map.containsKey(lr) ? map.get(lr) + 1 : 1;
                map.put(lr, value);
            } else if (Character.isLowerCase(licensePlate.charAt(i))) {
                char lr = licensePlate.charAt(i);
                int value = map.containsKey(lr) ? map.get(lr) + 1 : 1;
                map.put(lr, value);
            }
        }
        String ans = null;
        int len = Integer.MAX_VALUE;
        for (String word : words) {
            HashMap<Character, Integer> temp = new HashMap<>();
            boolean isValid = true;
            for (int i = 0; i < word.length(); i++) {
                char lr = word.charAt(i);
                int value = temp.containsKey(lr) ? temp.get(lr) + 1 : 1;
                temp.put(lr, value);
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (!(temp.containsKey(entry.getKey()) && entry.getValue() <= temp.get(entry.getKey()))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid && word.length() < len) {
                ans = word;
                len = word.length();
            }
        }
        return ans;
    }
}
