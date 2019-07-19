package Leetcode.Hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Leetcode_884_Uncommon_Words_from_Two_Sentences {
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(A, B)));
    }

    private static String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> mapa = new HashMap<>();
        HashMap<String, Integer> mapb = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        String[] arraya = A.split(" "), arrayb = B.split(" ");
        for(String word : arraya){
            int value = mapa.containsKey(word) ? mapa.get(word) + 1 : 1;
            mapa.put(word, value);
        }
        for(String word : arrayb){
            int value = mapb.containsKey(word) ? mapb.get(word) + 1 : 1;
            mapb.put(word, value);
        }
        for(Map.Entry<String, Integer> entry : mapa.entrySet()){
            if((!mapb.containsKey(entry.getKey())) && entry.getValue() == 1)
                res.add(entry.getKey());
        }
        for(Map.Entry<String, Integer> entry : mapb.entrySet()){
            if((!mapa.containsKey(entry.getKey())) && entry.getValue() == 1)
                res.add(entry.getKey());
        }
        return res.toArray(new String[0]); // pass new String[0]

    }
}
