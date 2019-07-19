package Leetcode.String;

import java.util.HashMap;

public class Leetcode_859_Buddy_Strings {
    public static void main(String[] args) {
        String A = "aacb";
        String B = "acba";
        System.out.println(buddyStrings(A, B));
    }

    private static boolean buddyStrings(String A, String B) {
        if(A.length() != B.length())
            return false;
        int cntDiff = 0;
        HashMap<Character, Integer> lrA = new HashMap<>(); // use 26 size array!
        HashMap<Character, Integer> lrB = new HashMap<>();
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) != B.charAt(i))
                cntDiff++;
            if(cntDiff > 2)
                return false;
            lrA.put(A.charAt(i), lrA.getOrDefault((A.charAt(i)), 0) + 1);
            lrB.put(B.charAt(i), lrB.getOrDefault((B.charAt(i)), 0) + 1);
        }
        if(cntDiff == 2){
            for (Character key : lrA.keySet()) {
                if(!lrB.containsKey(key) || !lrA.get(key).equals(lrB.get(key)))
                    return false;
            }
            return true;
        }else if(cntDiff ==  1){
            return false;
        }else{
            if(lrA.size() < A.length())
                return true;
            return false;
        }
    }
}
/* if(A.length() != B.length()) {
            return false;
        }
        boolean check = true;

        if(A.equals(B)) {
            int[] count = new int[26];
            for (int i = 0; i < A.length(); ++i)
                count[A.charAt(i) - 'a']++;

            for (int c: count)
                if (c > 1) return true;
            return false;
        } else {


       int first = -1, second = -1;
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }
            return (second != -1 && A.charAt(first) == B.charAt(second) &&
                    A.charAt(second) == B.charAt(first));
        }

    }*/

