package Leetcode.Hashtable;

import java.util.HashSet;

public class Leetcode_771_Jewels_and_Stones {
    public static void main(String[] args) {
        String J = "aA";
        String S = "AAabDcc";
        System.out.println(numJewelsInStones(J, S));
    }

    private static int numJewelsInStones(String J, String S) {
        HashSet<String> jSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            jSet.add(Character.toString(J.charAt(i)));
        }
        for (int i = 0; i < S.length(); i++) {
            if (jSet.contains(Character.toString(S.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
}
