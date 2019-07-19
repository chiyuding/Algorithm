package Leetcode.Hashtable;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Leetcode_387_First_Unique_Character_in_a_String {
    public static void main(String[] args){
        String s = "dawwe";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s){
        Hashtable<Character, ArrayList> cnt = new Hashtable<>();
        int ans = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            char lr = s.charAt(i);
            if(!cnt.containsKey(lr))
                cnt.put(lr, new ArrayList());
            cnt.get(lr).add(i);
        }
        // System.out.println(cnt.toString());
        for(Map.Entry<Character, ArrayList> entry : cnt.entrySet()){
            ArrayList<Integer> value = entry.getValue();
            if(value.size() == 1)
                ans = value.get(0) < ans ? value.get(0) : ans;
        }
        if(ans >= 0 && cnt.get(s.charAt(ans)).size() > 1)
            ans = -1;
        return ans;
    }
}
