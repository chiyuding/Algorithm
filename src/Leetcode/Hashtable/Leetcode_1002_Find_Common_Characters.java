package Leetcode.Hashtable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Leetcode_1002_Find_Common_Characters {
    public static void main(String[] args){
        String[] A = {"bella","label","roller"};
        ArrayList<String> ans = commonChars(A);
        for(String str : ans){
            System.out.print(str);
        }
    }

    private static ArrayList<String> commonChars(String[] A){
        Hashtable<String, Integer> lr_cnt = new Hashtable<>();
        ArrayList<String> ans = new ArrayList<>();
        for(int k = 0; k < A[0].length(); k++){
            String temp = String.valueOf(A[0].charAt(k));
            if(lr_cnt.containsKey(temp)){
                lr_cnt.put(temp, lr_cnt.get(temp) + 1);
            }else{
                lr_cnt.put(temp, 1);
            }
        }
        for(int l = 1; l < A.length; l++){
            int[] count = new int[26];
            for(int i = 0; i < A[l].length(); i++){
                char lr = A[l].charAt(i);
                count[lr - 'a'] ++;
            }
            for(int j = 0; j < 26; j++){
                String temp = String.valueOf((char)('a' + j));
                if(lr_cnt.containsKey(temp)){
                    int min = Integer.min(lr_cnt.get(temp), count[j]);
                    lr_cnt.put(temp, min);
                }else{
                    lr_cnt.put(temp, 0);
                }
            }
        }
        for(Map.Entry<String, Integer> entry : lr_cnt.entrySet()){
            if(entry.getValue() > 0){
                int i = 0;
                while(i++ < entry.getValue()){
                    ans.add(entry.getKey());
                }
            }
        }
        return ans;
    }
}
