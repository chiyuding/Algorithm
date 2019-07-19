package Leetcode.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Leetcode_893_Groups_of_Special_Equivalent_Strings {
    public static void main(String[] args){
        String[] A = {"a","b","c","a","c","c"};
        System.out.println(numSpecialEquivGroups(A));
    }

    private static int numSpecialEquivGroups(String[] A){
        HashSet<String> group = new HashSet<>();
        for(String str : A){
            ArrayList<Character> temp1 = new ArrayList<>();
            ArrayList<Character> temp2 = new ArrayList<>();
            for(int i = 0; i < str.length(); i++){
                if(i % 2 == 0){
                    temp1.add(str.charAt(i));
                }else{
                    temp2.add(str.charAt(i));
                }
            }
            Collections.sort(temp1);
            Collections.sort(temp2);
            temp1.addAll(temp2);
            StringBuilder temp = new StringBuilder();
            for(char ch : temp1){
                temp.append(ch);
            }
            group.add(new String(temp));
        }
        return group.size();
    }
}
